package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.entity.Sell;
import com.guigu.yaopin.hjh.entity.SellExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SellMapper {
	   List<Sell>   getsell(QueryVo v);
	   Sell getsellid(int sellid);
	  int  getsellcount(QueryVo v);
    int countByExample(SellExample example);

    int deleteByExample(SellExample example);

    int deleteByPrimaryKey(Integer sellid);

    int insert(Sell record);

    int insertSelective(Sell record);

    List<Sell> selectByExample(SellExample example);

    Sell selectByPrimaryKey(Integer sellid);

    int updateByExampleSelective(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByExample(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}