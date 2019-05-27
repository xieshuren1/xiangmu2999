package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.*;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FinancialMapper {
	Financial getdid(String format);
    int countByExample(FinancialExample example);

    int deleteByExample(FinancialExample example);

    int deleteByPrimaryKey(Integer financialid);

    int insert(Financial record);

    int insertSelective(Financial record);

    List<Financial> selectByExample(FinancialExample example);

    Financial selectByPrimaryKey(Integer financialid);

    int updateByExampleSelective(@Param("record") Financial record, @Param("example") FinancialExample example);

    int updateByExample(@Param("record") Financial record, @Param("example") FinancialExample example);

    int updateByPrimaryKeySelective(Financial record);

    int updateByPrimaryKey(Financial record);
}