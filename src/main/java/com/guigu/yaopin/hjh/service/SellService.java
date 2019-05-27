package com.guigu.yaopin.hjh.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.entity.Sell;

public interface SellService {
	 List<Sell>   getsell(QueryVo v);
int 	 getsellcount(QueryVo v);
 int getsellnext(int sellid,int number,HttpSession session,int fmoney);
}
