package com.guigu.yaopin.dyj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.yaopin.dyj.pojo.Emp;
import com.guigu.yaopin.dyj.pojo.QueryVO;
import com.guigu.yaopin.dyj.service.QueryVOService;
import com.guigu.yaopin.hjh.entity.Consumer;
import com.guigu.yaopin.hjh.entity.Durg;

@RestController
public class QueryVOController {
	@Autowired
	private QueryVOService qs;
	@RequestMapping("wenjian2/findQueryVO")
	public Map<String, Object> findQueryVO(int page,Emp e,Consumer c,Durg d){
		QueryVO vo=new QueryVO();
		vo.setMaxPage(5);
		vo.setPageNum((page-1)*5);
		vo.setC(c);
		vo.setE(e);
		vo.setD(d);
		List<QueryVO> find = qs.find(vo);
		int newscount = qs.count(vo);
		int num=newscount%5==0?(newscount/5):(newscount/5)+1;
		Map map = new HashMap();
		map.put("rows",find);
		map.put("total",num);
		return map;
	}
}
