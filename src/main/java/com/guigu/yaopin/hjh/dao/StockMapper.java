package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.*;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StockMapper {
	Stock  stockdid(int did);
    int countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int deleteByPrimaryKey(Integer stockid);

    int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(Integer stockid);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}