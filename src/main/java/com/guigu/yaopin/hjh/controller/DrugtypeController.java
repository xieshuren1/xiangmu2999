package com.guigu.yaopin.hjh.controller;

import com.guigu.yaopin.hjh.entity.*;
import com.guigu.yaopin.hjh.service.DrugService;
import com.guigu.yaopin.xsr.doamin.users;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

@RestController
public class DrugtypeController {
	@Autowired
	private DrugService drug;

	@RequestMapping("selecttype")
	public List<Drugtype> drugtype() {

		List<Drugtype> drugtype = drug.drugtype();

		return drugtype;
	}

	@RequestMapping("selectdrug")
	public Map<String, Object> selectdrug(int tyid, int page, int rows, String name) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (name == null || name.equals("")) {

			map.put("rows", drug.selectdrug(new QueryVo(tyid, (page - 1) * rows, rows, name)));
			map.put("total", drug.countByExample(new QueryVo(tyid)));
		} else {

			map.put("rows", drug.selectdurgname(new QueryVo(tyid, (page - 1) * rows, rows, name)));
			map.put("total", drug.selectdurgnamecount(new QueryVo(tyid, (page - 1) * rows, rows, name)));
		}
		
		return map;
	}

	@RequestMapping("durgadd")
	public int durgadd(Stock s, String money, int supplierid, HttpSession session) {
		users u = (users) session.getAttribute("user_us");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		Financial f = new Financial(s.getDid(), u.getUserid(), s.getStocknum(), format, money, 1);

		return drug.updateByPrimaryKeySelective(s, f, supplierid, format);
	}

	@RequestMapping("getDept")
	public List<Supplier> getDept() {

		List<Supplier> selectByExamplesupplier = drug.selectByExamplesupplier();
		return selectByExamplesupplier;
	}

}