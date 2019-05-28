package com.guigu.yaopin.dyj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.dyj.pojo.Emp;
import com.guigu.yaopin.dyj.pojo.Users;
import com.guigu.yaopin.dyj.pojo.UsersQuervo;
import com.guigu.yaopin.dyj.service.EmpService;
import com.guigu.yaopin.dyj.service.UsersService;



@RestController
public class UsersController {
	@Autowired
	private UsersService us;
	@Autowired
	private EmpService es;
	@RequestMapping("/findusers1")
	public Map<String,Object> findUsers1(Users u,Emp e,int rows,int page){
		UsersQuervo p=new UsersQuervo(rows*(page-1), rows,u,e);
		List<Users> list = us.findUsers(p);
		Map<String, Object> map=new HashMap();
		map.put("rows", list);
		map.put("total", us.count(p));
		return map;
	}
	@RequestMapping("/updateRid")
	public int updateRid(Users u){
		int updateRid = us.updateRid(u);
		return updateRid;
	}
	@RequestMapping("/insertUsers")
	public int insertUsers(Users u,Emp e){
		  ByteSource bytes = ByteSource.Util.bytes(u.getUsername());
	      SimpleHash hash = new SimpleHash("MD5","123456",bytes,1234);
	      u.setPasswordm(hash.toString());
	      int addUsers = us.addUsers(u);
	      e.setUid(u.getUserid());
	      int insert = es.insert(e);
	      return insert;
	}
	@RequestMapping("/showByUserid")
	public Users showByUserid(int uid){
		Users showByUsersid = us.showByUsersid(uid);
		return showByUsersid;
	}
	@RequestMapping("/deleteUsers")
	public int deleteUsers(int[] idlist){
		int deleteUsers = us.deleteUsers(idlist);
		int deleteEmp = es.deleteEmp(idlist);
		return deleteEmp;
	}
	@RequestMapping("/showUsersByIds")
	public  List<Users> showUsersByIds(int jid){
		 List<Users> showUsersByIds = us.showUsersByIds(jid);
		return showUsersByIds;
	}
}
