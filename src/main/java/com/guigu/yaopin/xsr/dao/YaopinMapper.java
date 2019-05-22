package com.guigu.yaopin.xsr.dao;

import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YaopinMapper {

    List<quanxian > chaquanxian(quanxian us);//查询权限

    users  login_xsr(users us); //登录

    int xiumi(users us);//修改密码
}
