package com.guigu.yaopin.hjh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.hjh.entity.Consumer;
import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.service.MarketingService;

@RestController
public class MarketingController {
	@Autowired
	private MarketingService mk;

	@RequestMapping("getdurgstock")
	public Map<String, Object> getstock(int page, int rows, String name) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("rows", mk.getstock(new QueryVo(0, (page - 1) * rows, rows, name)));
		map.put("total", mk.getstockcount(new QueryVo(0, (page - 1) * rows, rows, name)));
		return map;

	}

	@RequestMapping("getconsumer")
	public List<Consumer> getconsumer() {

		List<Consumer> getconsumer = mk.getconsumer();
		return getconsumer;
	}
	@RequestMapping("getmarketing")
	public int getmarketing(int stocknum ,int money ,int durgid,int muser,int  payment,int paymentmoney,HttpSession session) {
		

		return mk.getmarketing(stocknum,money,durgid,muser,payment,paymentmoney,session);
	}
}
