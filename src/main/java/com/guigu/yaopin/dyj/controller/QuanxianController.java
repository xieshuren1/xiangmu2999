package com.guigu.yaopin.dyj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.dyj.pojo.Quanxian;
import com.guigu.yaopin.dyj.service.QuanxianService;
import com.guigu.yaopin.xsr.doamin.quanxian;

@RestController
public class QuanxianController {
	@Autowired
	private QuanxianService qs;
	@RequestMapping("wenjian_dyj/showTrees")
	public List<Quanxian> showTrees(){
		List<Quanxian> showTrees = qs.showTrees();
		return showTrees;
	}
}
