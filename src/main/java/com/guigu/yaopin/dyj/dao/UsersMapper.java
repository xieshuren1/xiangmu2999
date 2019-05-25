package com.guigu.yaopin.dyj.dao;

import com.guigu.yaopin.dyj.pojo.Users;
import com.guigu.yaopin.dyj.pojo.UsersExample;
import com.guigu.yaopin.dyj.pojo.UsersQuervo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UsersMapper {
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Users record);
    int deleteUsers(int[] idlist);
    int insertSelective(Users record);
    List<Users> findUsers(UsersQuervo vo);
    int count(UsersQuervo vo);
    List<Users> selectByExample(UsersExample example);
    int updateRid(Users u);
    Users selectByPrimaryKey(Integer userid);
    int addUsers(Users u);
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);
    Users showByUserid(int userid);
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}