package com.guigu.yaopin.dyj.controller;

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
}
