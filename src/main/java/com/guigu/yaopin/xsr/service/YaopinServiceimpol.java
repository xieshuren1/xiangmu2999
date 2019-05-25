package com.guigu.yaopin.xsr.service;

import com.guigu.yaopin.xsr.dao.YaopinMapper;
import com.guigu.yaopin.xsr.doamin.drugType;
import com.guigu.yaopin.xsr.doamin.emp;
import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.doamin.xiaoshoujindu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class YaopinServiceimpol implements YaopinService {
    @Autowired
    private YaopinMapper dao;

    @Override
    public List<quanxian> chaquanxian(quanxian us) {
        List<quanxian> arr = dao.chaquanxian(us);
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

	@Override
	public int logintime(int userid) {
		int logintime = dao.logintime(userid);
		return logintime;
	}

	@Override
	public String selectlotime(int userid) {
		String selectlotime = dao.selectlotime(userid);
		return selectlotime;
	}

	@Override
	public List<xiaoshoujindu> jindu_xsr() {
		List<xiaoshoujindu> jindu_xsr = dao.jindu_xsr();
		return jindu_xsr;
	}

	@Override
	public List<drugType> leiclass() {
		List<drugType> leiclass = dao.leiclass();
		return leiclass;
	}

	@Override
	public List<xiaoshoujindu> jindu_xsr12(int typeid) {
		List<xiaoshoujindu> jindu_xsr12 = dao.jindu_xsr12(typeid);
		return jindu_xsr12;
	}

	@Override
	public emp user_emp(int uid) {
		emp user_emp = dao.user_emp(uid);
		return user_emp;
	}

	@Override
	public String chajuese(int jid) {
		String chajuese = dao.chajuese(jid);
		return chajuese;
	}
}
