package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancialtypeMapper {
    int countByExample(FinancialtypeExample example);

    int deleteByExample(FinancialtypeExample example);

    int deleteByPrimaryKey(Integer ftypeid);

    int insert(Financialtype record);

    int insertSelective(Financialtype record);

    List<Financialtype> selectByExample(FinancialtypeExample example);

    Financialtype selectByPrimaryKey(Integer ftypeid);

    int updateByExampleSelective(@Param("record") Financialtype record, @Param("example") FinancialtypeExample example);

    int updateByExample(@Param("record") Financialtype record, @Param("example") FinancialtypeExample example);

    int updateByPrimaryKeySelective(Financialtype record);

    int updateByPrimaryKey(Financialtype record);
}