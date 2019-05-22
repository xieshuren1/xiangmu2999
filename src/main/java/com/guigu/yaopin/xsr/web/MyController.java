package com.guigu.yaopin.xsr.web;

import com.guigu.yaopin.xsr.doamin.quanxian;
import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.service.YaopinService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
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
               System.out.println("登录成功");
               users user= im.login_xsr(us);
               session.setAttribute("user_us",user);
               session.setAttribute("user_name",user.getJuesename());
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
     public @ResponseBody List<quanxian > username_sclogintime(HttpSession session){	 
    	 users us= (users) session.getAttribute("user_us");
    	 	
          return null;
     }
}
