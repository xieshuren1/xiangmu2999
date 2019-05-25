package com.guigu.yaopin.dyj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.dyj.dao.EmpMapper;
import com.guigu.yaopin.dyj.pojo.Emp;

@Service
public class EmpService {
	@Autowired
	private EmpMapper mapper;
	public int insert(Emp e){
		int insert = mapper.insert(e);
		return insert;
	}
	public int updateEmp(Emp e){
		int updateEmp = mapper.updateEmp(e);
		return updateEmp;
	}
	public int deleteEmp(int[] idlist){
		int deleteEmp = mapper.deleteEmp(idlist);
		return deleteEmp;
	}
}
