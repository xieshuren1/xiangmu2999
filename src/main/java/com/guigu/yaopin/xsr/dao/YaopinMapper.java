package com.guigu.yaopin.xsr.dao;

import com.guigu.yaopin.xsr.doamin.drugType;
import com.guigu.yaopin.xsr.doamin.emp;
import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.rukushiti;
import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.doamin.xiaoshoujindu;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YaopinMapper {

    List<quanxian > chaquanxian(quanxian us);//查询权限

    users  login_xsr(users us); //登录

    int xiumi(users us);//修改密码

    int addUsers(users u);

    
    int logintime(int userid); //插入登录时间表
    
    String selectlotime(int userid);//查询上一次登录时间
    
    List<xiaoshoujindu> jindu_xsr();//查询药品的销售数量  实现销售进度
    
    List<xiaoshoujindu> jindu_xsr12(int typeid);
    
    List<drugType> leiclass();//查询所有类型
    
    emp user_emp(int uid); //查询员工
    
    String chajuese(int jid);//查询角色
    
    int upemp(emp em);//修改员工表
    
    List<rukushiti> rukuselect();//入库查询

}
