package com.guigu.yaopin.dyj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.guigu.yaopin.dyj.pojo.QueryVO;

@Mapper
public interface QueryVOMapper {
	List<QueryVO> findQueryVO(QueryVO vo);
	int count(QueryVO vo);
}
