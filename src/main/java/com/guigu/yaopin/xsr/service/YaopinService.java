package com.guigu.yaopin.xsr.service;

import com.guigu.yaopin.xsr.doamin.drugType;
import com.guigu.yaopin.xsr.doamin.emp;
import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.doamin.xiaoshoujindu;

import java.util.List;

public interface YaopinService {

	List<quanxian > chaquanxian(quanxian us);//查询权限

    users login_xsr(users us); //登录

    int xiumi(users us);//修改密码

    int addUsers(users us);

    int logintime(int userid); //插入登录时间表
    
    String selectlotime(int userid);//查询上一次登录时间
    
    List<xiaoshoujindu> jindu_xsr();//查询药品的销售数量  实现销售进度
    
    List<drugType> leiclass();//查询所有类型
    
    List<xiaoshoujindu> jindu_xsr12(int typeid);
    
    emp user_emp(int uid); //查询员工
    
    String chajuese(int jid);//查询角色
}
