package com.guigu.yaopin.xsr.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.yaopin.xsr.doamin.drugType;
import com.guigu.yaopin.xsr.doamin.emp;
import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.rukushiti;
import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.doamin.xiaoshoujindu;
import com.guigu.yaopin.xsr.service.YaopinService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
     @Autowired
     private YaopinService im;

     private Map cunjihe = new HashMap();

     @RequestMapping("login_xsr")
     public @ResponseBody String login_xsr(users us, HttpSession session){
          Subject sub = SecurityUtils.getSubject();
          UsernamePasswordToken tk = new UsernamePasswordToken(us.getUsername(),us.getPasswordm());
          try {
               sub.login(tk);
              
               users user= im.login_xsr(us);
               session.setAttribute("user_us",user);
               session.setAttribute("user_usid",user.getUserid());
               im.logintime(user.getUserid());
               String selectlotime = im.selectlotime(user.getUserid());
               if(selectlotime==null) {
            	   selectlotime="第一次登录";
               }
               session.setAttribute("logindate",selectlotime);
               return "1";
          }catch (Exception e){
               System.out.println("登录失败");
          }
          return "0";
     }

     @RequestMapping("quanxian_xsr")
     public @ResponseBody List<quanxian > chaquanxian(String nid,HttpSession session){	 
          int nnid=Integer.parseInt(nid);
          List<String> qx1=new ArrayList<String>();
          
          if(nnid==0) {
        	  users us= (users) session.getAttribute("user_us");
         	  String qx = us.getQuanxian();
         	  String[] split = qx.split(",");         	  
         	  for (String string : split) {
    			qx1.add(string);
         	  }
          }  else { 
        	  qx1=null;
          }
          
          quanxian quanxi=new quanxian(0, null, null, nnid,qx1);
          List<quanxian> arr = im.chaquanxian(quanxi);
          return arr;
     }

     @RequestMapping("username_sclogintime")
     public @ResponseBody List<String> username_sclogintime(HttpSession session){	 
    	 users us= (users) session.getAttribute("user_us");
    	 List<String> arr = new ArrayList<String>();
    	 arr.add(us.getUsername());
    	 arr.add((String)session.getAttribute("logindate"));
          return arr;
     }

     
     @RequestMapping("jinduchaxun")
     public @ResponseBody Map jinduchaxun(int dangqianyeshu,String leixing,HttpSession session){   
    	 List<drugType> leiclass = im.leiclass();
    	 for (drugType drugType : leiclass) {
			cunjihe.put(drugType.getTypename(), drugType.getTypeid());
    	 }
    	 List<xiaoshoujindu> jindu_xsr=new ArrayList<xiaoshoujindu>();
    	 if(cunjihe.get(leixing)!=null) {
    		 PageHelper.startPage(dangqianyeshu, 16);  
    		 jindu_xsr = im.jindu_xsr12((int)cunjihe.get(leixing));
    	 } else {
    		 PageHelper.startPage(dangqianyeshu, 16); 
    		 jindu_xsr = im.jindu_xsr();  
    	 }  
    	 PageInfo<xiaoshoujindu> info = new PageInfo<>(jindu_xsr);
 		int zonghang = (int) info.getTotal();
 		int num = 0;
 		if(zonghang%16==0){
 			num=zonghang/16;
 		}else{
 			num=zonghang/16+1;
 		}
 		Map map = new HashMap();
		map.put("rows",jindu_xsr);//存集合
		map.put("total",num);//存总页数
		map.put("yaoclass", leiclass);
          return map;
     }
     
     @RequestMapping("user_emp")
     public @ResponseBody Map user_emp(HttpSession session){	 
    	 users us= (users) session.getAttribute("user_us");
    	 emp user_emp = im.user_emp(us.getJid());
    	 String chajuese = im.chajuese(us.getJid());
    	 Map map = new HashMap();
    	 map.put("user", us);
    	 map.put("emp", user_emp);
    	 map.put("juese", chajuese);
          return map;
     }
     
     @RequestMapping("update_user_emp")
     public @ResponseBody String update_user_emp(emp em,HttpSession session){	 
    	 users us= (users) session.getAttribute("user_us");
    	em.setUid(us.getUserid());
    	int upemp = im.upemp(em);
          return upemp+"";
     }
     //github.com/xieshuren1/xiangmu2999.git
     
     @RequestMapping("updatemima")
     public @ResponseBody String updatemima(String passwordm,String passwo,HttpSession session){	 
    	 users us= (users) session.getAttribute("user_us");
    	 ByteSource bytes = ByteSource.Util.bytes(us.getUsername());
         SimpleHash hash = new SimpleHash("MD5",passwordm,bytes,1234);
         if(hash.toString().equals(us.getPasswordm())) {
        	 SimpleHash hash2 = new SimpleHash("MD5",passwo,bytes,1234);
        	 us.setPasswordm(hash2.toString());
        	 int xiumi = im.xiumi(us);
        	 return xiumi+"";
         }
          return "原始输入密码错误";
     }
     
     @RequestMapping("rukuse_xsr")
     public @ResponseBody Map rukuse(int yeshu,HttpSession session){
    	 int d=10;
    	 PageHelper.startPage(yeshu, d);  
    	 List<rukushiti> rukuselect = im.rukuselect();
    	 PageInfo<rukushiti> info = new PageInfo<>(rukuselect);
  		int zonghang = (int) info.getTotal();
  		int num = 0;
  		if(zonghang%d==0){
  			num=zonghang/d;
  		}else{
  			num=zonghang/d+1;
  		}
  		Map map = new HashMap();
 		map.put("rows",rukuselect);//存集合
 		map.put("total",num);//存总页数
          return map;
     }
     
}
