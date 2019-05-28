package com.guigu.yaopin.dyj.dao;

import com.guigu.yaopin.dyj.pojo.Quanxian;
import com.guigu.yaopin.dyj.pojo.QuanxianExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface QuanxianMapper {
    int countByExample(QuanxianExample example);

    int deleteByExample(QuanxianExample example);

    int deleteByPrimaryKey(Integer qid);

    int insert(Quanxian record);

    int insertSelective(Quanxian record);

    List<Quanxian> selectByExample(QuanxianExample example);
    List<Quanxian> showTrees();
    Quanxian selectByPrimaryKey(Integer qid);

    int updateByExampleSelective(@Param("record") Quanxian record, @Param("example") QuanxianExample example);

    int updateByExample(@Param("record") Quanxian record, @Param("example") QuanxianExample example);

    int updateByPrimaryKeySelective(Quanxian record);

    int updateByPrimaryKey(Quanxian record);
}