package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.*;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DurgMapper {
	List<Durg>  getstock(QueryVo tyid);
	int getstockcount(QueryVo tyid);
	 int  selectdurgnamecount(QueryVo tyid);
	 List<Durg>   selectdurgname(QueryVo tyid);
	 List<Durg> selectdrug(QueryVo tyid);
    int  countByExample(QueryVo v);

    int deleteByExample(DurgExample example);

    int deleteByPrimaryKey(Integer durgid);

    int insert(Durg record);

    int insertSelective(Durg record);

    List<Durg> selectByExample(DurgExample example);

    Durg selectByPrimaryKey(Integer durgid);

    int updateByExampleSelective(@Param("record") Durg record, @Param("example") DurgExample example);

    int updateByExample(@Param("record") Durg record, @Param("example") DurgExample example);

    int updateByPrimaryKeySelective(Durg record);

    int updateByPrimaryKey(Durg record);
}