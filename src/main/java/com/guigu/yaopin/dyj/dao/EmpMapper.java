package com.guigu.yaopin.dyj.dao;

import com.guigu.yaopin.dyj.pojo.Emp;
import com.guigu.yaopin.dyj.pojo.EmpExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EmpMapper {
    int countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer empid);

    int insert(Emp record);

    int insertSelective(Emp record);
    int deleteEmp(int[] idlist);
    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer empid);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp record);
    int updateEmp(Emp e);
    int updateByPrimaryKey(Emp record);
}