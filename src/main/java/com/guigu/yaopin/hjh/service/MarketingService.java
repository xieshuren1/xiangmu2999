package com.guigu.yaopin.hjh.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.guigu.yaopin.hjh.entity.Consumer;
import com.guigu.yaopin.hjh.entity.Durg;
import com.guigu.yaopin.hjh.entity.QueryVo;

public interface MarketingService {
	List<Durg>  getstock(QueryVo tyid);
	int getstockcount(QueryVo tyid);
	List<Consumer>	getconsumer();
 
	int getmarketing(int stocknum,int money,int durgid,int muser,int payment,int paymentmoney,HttpSession session);
}
