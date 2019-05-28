package com.guigu.yaopin.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.dyj.dao.QuanxianMapper;
import com.guigu.yaopin.dyj.pojo.Quanxian;

@Service
public class QuanxianService {
	@Autowired
	private QuanxianMapper mapper;
	public List<Quanxian> showTrees(){
		List<Quanxian> list = mapper.showTrees();
		return list;
	}
}
