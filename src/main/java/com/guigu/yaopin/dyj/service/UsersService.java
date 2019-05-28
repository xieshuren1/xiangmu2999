package com.guigu.yaopin.dyj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.dyj.dao.UsersMapper;
import com.guigu.yaopin.dyj.pojo.Users;
import com.guigu.yaopin.dyj.pojo.UsersQuervo;

@Service
public class UsersService {
	@Autowired
	private UsersMapper mapper;
	public List<Users> findUsers(UsersQuervo vo){
		List<Users> findUsers = mapper.findUsers(vo);
		return findUsers;
	}
	public int count(UsersQuervo vo){
		int count = mapper.count(vo);
		return count;
	}
	public int updateRid(Users u){
		int updateRid = mapper.updateRid(u);
		return updateRid;
	}
	public int addUsers(Users u){
		int addUsers = mapper.addUsers(u);
		return addUsers;
	}
	public Users showByUsersid(int userid){
		Users showByUserid = mapper.showByUserid(userid);
		return showByUserid;
	}
	public int deleteUsers(int[] idlist){
		int deleteUsers = mapper.deleteUsers(idlist);
		return deleteUsers;
	}
	public  List<Users> showUsersByIds(int jid){
		 List<Users> showUsersByIds = mapper.showUsersByIds(jid);
		return showUsersByIds;
	}
}
