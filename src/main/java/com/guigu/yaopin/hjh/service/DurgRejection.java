package com.guigu.yaopin.hjh.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.guigu.yaopin.hjh.entity.Gostock;
import com.guigu.yaopin.hjh.entity.QueryVo;

public interface DurgRejection {
List<Gostock>	getgostocklist( QueryVo v);
int getgostocklistcount(QueryVo v);
 int durgrejection(int bianhao,int shuliang,String jine,HttpSession session);
}
