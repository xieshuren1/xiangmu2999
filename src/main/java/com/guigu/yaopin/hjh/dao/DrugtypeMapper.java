package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.*;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DrugtypeMapper {
    int countByExample(DrugtypeExample example);

    int deleteByExample(DrugtypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Drugtype record);

    int insertSelective(Drugtype record);

    List<Drugtype> selectByExample(DrugtypeExample example);

    Drugtype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Drugtype record, @Param("example") DrugtypeExample example);

    int updateByExample(@Param("record") Drugtype record, @Param("example") DrugtypeExample example);

    int updateByPrimaryKeySelective(Drugtype record);

    int updateByPrimaryKey(Drugtype record);
}