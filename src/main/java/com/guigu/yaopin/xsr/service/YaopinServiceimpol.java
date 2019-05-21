package com.guigu.yaopin.xsr.service;

import com.guigu.yaopin.xsr.dao.YaopinMapper;
import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YaopinServiceimpol implements YaopinService {
    @Autowired
    private YaopinMapper dao;

    @Override
    public List<quanxian> chaquanxian(int nid) {
        List<quanxian> arr = dao.chaquanxian(nid);
        System.out.println(arr);
        return arr;
    }

    @Override
    public users login_xsr(users us) {
        users user = dao.login_xsr(us);
        return user;
    }

    @Override
    public int xiumi(users us) {
        int i=dao.xiumi(us);
        return i;
    }
}
