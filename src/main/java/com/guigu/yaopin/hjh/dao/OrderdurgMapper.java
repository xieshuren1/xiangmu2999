package com.guigu.yaopin.hjh.dao;

import com.guigu.yaopin.hjh.entity.Orderdurg;
import com.guigu.yaopin.hjh.entity.OrderdurgExample;
import com.guigu.yaopin.hjh.entity.QueryVo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderdurgMapper {
	int getordercount(QueryVo v);
	 List<Orderdurg> getorderlist(QueryVo v);
    int countByExample(OrderdurgExample example);

    int deleteByExample(OrderdurgExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orderdurg record);

    int insertSelective(Orderdurg record);

    List<Orderdurg> selectByExample(OrderdurgExample example);

    Orderdurg selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Orderdurg record, @Param("example") OrderdurgExample example);

    int updateByExample(@Param("record") Orderdurg record, @Param("example") OrderdurgExample example);

    int updateByPrimaryKeySelective(Orderdurg record);

    int updateByPrimaryKey(Orderdurg record);
}