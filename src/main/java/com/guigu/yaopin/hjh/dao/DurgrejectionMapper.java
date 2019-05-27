package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.Durgrejection;
import com.guigu.yaopin.hjh.entity.DurgrejectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DurgrejectionMapper {
    int countByExample(DurgrejectionExample example);

    int deleteByExample(DurgrejectionExample example);

    int deleteByPrimaryKey(Integer djid);

    int insert(Durgrejection record);

    int insertSelective(Durgrejection record);

    List<Durgrejection> selectByExample(DurgrejectionExample example);

    Durgrejection selectByPrimaryKey(Integer djid);

    int updateByExampleSelective(@Param("record") Durgrejection record, @Param("example") DurgrejectionExample example);

    int updateByExample(@Param("record") Durgrejection record, @Param("example") DurgrejectionExample example);

    int updateByPrimaryKeySelective(Durgrejection record);

    int updateByPrimaryKey(Durgrejection record);
}