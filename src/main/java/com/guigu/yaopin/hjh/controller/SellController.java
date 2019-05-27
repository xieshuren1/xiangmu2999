package com.guigu.yaopin.hjh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.hjh.dao.FinancialMapper;
import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.entity.Sell;
import com.guigu.yaopin.hjh.service.SellService;

@RestController
public class SellController {
	@Autowired
	private SellService sm;
	

	@RequestMapping("getsell")
	public Map<String, Object> getsell(int page, int rows, String name) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("rows", sm.getsell(new QueryVo(0, (page - 1) * rows, rows, name)));
		map.put("total", sm.getsellcount(new QueryVo(0, (page - 1) * rows, rows, name)));
		return map;
	}
	@RequestMapping("getsellnext")
	public int getsellnext(int sellid,String cname,int number,int fmoney,HttpSession session) {
		
		int getsellnext = sm.getsellnext(sellid,number,session,fmoney);
		return getsellnext;
	}
	
	
}
