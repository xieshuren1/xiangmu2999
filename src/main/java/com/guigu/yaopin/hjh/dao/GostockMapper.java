package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.*;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface GostockMapper {
	Gostock	getgostock(int gsid);
	int getgostocklistcount(QueryVo v);
	List<Gostock>  getgostocklist(QueryVo v);
    int countByExample(GostockExample example);

    int deleteByExample(GostockExample example);

    int deleteByPrimaryKey(Integer gsid);

    int insert(Gostock record);

    int insertSelective(Gostock record);

    List<Gostock> selectByExample(GostockExample example);

    Gostock selectByPrimaryKey(Integer gsid);

    int updateByExampleSelective(@Param("record") Gostock record, @Param("example") GostockExample example);

    int updateByExample(@Param("record") Gostock record, @Param("example") GostockExample example);

    int updateByPrimaryKeySelective(Gostock record);

    int updateByPrimaryKey(Gostock record);
}