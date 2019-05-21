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
import java.util.List;

@Controller
public class MyController {
     @Autowired
     private YaopinService im;

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
               System.out.println("登录失败");//fgfd
          }
          return "0";
     }
}
