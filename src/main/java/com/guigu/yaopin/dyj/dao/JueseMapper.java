package com.guigu.yaopin.dyj.dao;

import com.guigu.yaopin.dyj.pojo.Juese;
import com.guigu.yaopin.dyj.pojo.JueseExample;
import com.guigu.yaopin.dyj.pojo.JueseQuervo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface JueseMapper {
    int countByExample(JueseExample example);

    int deleteByExample(JueseExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(Juese record);

    int insertSelective(Juese record);
    int addRole(String juesename);
    List<Juese> selectByExample(JueseExample example);
    List<Juese> showRole(JueseQuervo vo);
    int count(JueseQuervo vo);
    Juese selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") Juese record, @Param("example") JueseExample example);

    int updateByExample(@Param("record") Juese record, @Param("example") JueseExample example);

    int updateByPrimaryKeySelective(Juese record);

    int updateByPrimaryKey(Juese record);
    int updateByPrimaryKey1(Juese record);
}