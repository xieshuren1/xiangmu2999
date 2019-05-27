package com.guigu.yaopin.hjh.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.hjh.entity.Financial;
import com.guigu.yaopin.hjh.entity.Gostock;
import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.service.DurgRejection;
import com.guigu.yaopin.xsr.doamin.users;

@RestController
public class DurgRejectionController {
	@Autowired
	private DurgRejection dur;

	@RequestMapping("getgostocklist")
	public Map<String, Object> getgostocklist(int page, String suppliername) {
		page = (page - 1) * 8;
		Map<String, Object> map = new HashMap<String, Object>();

		QueryVo v = new QueryVo(page, suppliername);
		List<Gostock> getgostocklist = dur.getgostocklist(v);
		int count = dur.getgostocklistcount(v);
		int u = count % 8 == 0 ? count / 8 : (count / 8) + 1;
		map.put("list", getgostocklist);
		map.put("num", u);
		return map;

	}

	@RequestMapping("durgrejection")
	public int durgrejection(int bianhao, int shuliang, String jine,HttpSession session) {
	
	
		return dur.durgrejection(bianhao, shuliang, jine,session);
	}

}
