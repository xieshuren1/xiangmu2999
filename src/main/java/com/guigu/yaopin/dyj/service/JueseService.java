package com.guigu.yaopin.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.dyj.dao.JueseMapper;
import com.guigu.yaopin.dyj.pojo.Juese;
import com.guigu.yaopin.dyj.pojo.JueseExample;
import com.guigu.yaopin.dyj.pojo.JueseQuervo;

@Service
public class JueseService {
	@Autowired
	private JueseMapper mapper;
	public List<Juese> showRoles(){
		List<Juese> selectByExample = mapper.selectByExample(new JueseExample());
		return selectByExample;
	}
	public List<Juese> showRole2(JueseQuervo vo){
		List<Juese> showRole = mapper.showRole(vo);
		return showRole;
	}
	public int count(JueseQuervo vo){
		int count = mapper.count(vo);
		return count;
	}
}
