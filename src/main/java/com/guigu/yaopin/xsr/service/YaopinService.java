package com.guigu.yaopin.xsr.service;

import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.users;

import java.util.List;

public interface YaopinService {

	List<quanxian > chaquanxian(quanxian us);//查询权限

    users login_xsr(users us); //登录

    int xiumi(users us);//修改密码
}
