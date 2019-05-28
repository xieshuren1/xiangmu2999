package com.guigu.yaopin.dyj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.dyj.pojo.Juese;
import com.guigu.yaopin.dyj.pojo.JueseQuervo;
import com.guigu.yaopin.dyj.service.JueseService;


@RestController
public class JueseController {
	@Autowired
	private JueseService js;
	@RequestMapping("/showRoles")
	public List<Juese> showRoles(){
		List<Juese> showRoles = js.showRoles();
		return showRoles;
	}
	@RequestMapping("wenjian_dyj/showRole2")
	public Map<String,Object> showRole2(int yeshu,Juese j){
		JueseQuervo vo=new JueseQuervo();
		vo.setJ(j);
		vo.setMaxPage(5);
		vo.setPageNum((yeshu-1)*5);
		List<Juese> showNews = js.showRole2(vo);
		int newscount = js.count(vo);
		int num=newscount%5==0?(newscount/5):(newscount/5)+1;
		Map map = new HashMap();
		map.put("rows",showNews);
		map.put("total",num);
		return map;	
	}
	@RequestMapping("wenjian_dyj/addRole")
	public int addRole(String juesename){
		int addRole = js.addRole(juesename);
		return addRole;
	}
	@RequestMapping("wenjian_dyj/showRoleByIds")
	public Juese showRoleByIds(int jid){
		Juese showById = js.showById(jid);
		return showById;
	}
	@RequestMapping("wenjian_dyj/upRole")
	public int upRole(Juese j){
		int upRole = js.upRole(j);
		return upRole;
	}
	@RequestMapping("wenjian_dyj/delRole")
	public int delRole(int jid){
		int delRole = js.delRole(jid);
		return delRole;
	}
	@RequestMapping("wenjian_dyj/showTreesById")
	public List showTreesById(int jid){
		Juese showById = js.showById(jid);
		String quanxian=showById.getQuanxian();
		List list=new ArrayList<>();
		if(quanxian!=null){
			String[] split = quanxian.split(",");
			for (String string : split) {
				list.add(string);
			}
		}
		return list;
	}
	@RequestMapping("wenjian_dyj/upTrees")
	public int upTrees(Juese j){
		int upTrees = js.upTrees(j);
		return upTrees;
	}
}
