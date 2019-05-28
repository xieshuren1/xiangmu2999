package com.guigu.yaopin.xsr.common;

import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.service.YaopinService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class AuthRealm extends AuthorizingRealm{
	@Autowired
	private YaopinService im;
	//为用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
			
		return null;
	}

	//认证登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//token携带了用户信息
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
       		 //获取前端输入的用户名
        
         	String userName  = usernamePasswordToken.getUsername();
         
			ByteSource bytes = ByteSource.Util.bytes(usernamePasswordToken.getPassword());
			String pass = bytes.toString();
			users  user = im.login_xsr(new users(0,userName,"",0,"",""));
			System.out.println(user);
      		if(user!=null){
				//2.判断密码
				return new SimpleAuthenticationInfo(user,user.getPasswordm(),ByteSource.Util.bytes(usernamePasswordToken.getUsername()),"");
      		}else{
				//用户名不存在
				return null;//shiro底层会抛出UnKnowAccountException
			}

	}

}
