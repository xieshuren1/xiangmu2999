package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.Returngoods;
import com.guigu.yaopin.hjh.entity.ReturngoodsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ReturngoodsMapper {
    int countByExample(ReturngoodsExample example);

    int deleteByExample(ReturngoodsExample example);

    int deleteByPrimaryKey(Integer rgid);

    int insert(Returngoods record);

    int insertSelective(Returngoods record);

    List<Returngoods> selectByExample(ReturngoodsExample example);

    Returngoods selectByPrimaryKey(Integer rgid);

    int updateByExampleSelective(@Param("record") Returngoods record, @Param("example") ReturngoodsExample example);

    int updateByExample(@Param("record") Returngoods record, @Param("example") ReturngoodsExample example);

    int updateByPrimaryKeySelective(Returngoods record);

    int updateByPrimaryKey(Returngoods record);
}