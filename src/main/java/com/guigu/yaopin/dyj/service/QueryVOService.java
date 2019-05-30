package com.guigu.yaopin.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.dyj.dao.QueryVOMapper;
import com.guigu.yaopin.dyj.pojo.QueryVO;

@Service
public class QueryVOService {
	@Autowired
	private QueryVOMapper mapper;
	public List<QueryVO> find(QueryVO vo){
		List<QueryVO> findQueryVO = mapper.findQueryVO(vo);
		return findQueryVO;
	}
	public int count(QueryVO vo){
		int count = mapper.count(vo);
		return count;
	}
}
