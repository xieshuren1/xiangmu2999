package com.guigu.yaopin.dyj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.dyj.pojo.Emp;
import com.guigu.yaopin.dyj.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService es;
	
	@RequestMapping("/updateEmp")
	public int updateEmp(Emp e){
		int updateEmp = es.updateEmp(e);
		return updateEmp;
	}
}
