package com.guigu.yaopin.lsx.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.yaopin.lsx.Service.DurglsxSerive;
import com.guigu.yaopin.lsx.entity.Consumer;
import com.guigu.yaopin.lsx.entity.Durg;
import com.guigu.yaopin.lsx.entity.Supplier;
import com.guigu.yaopin.lsx.entity.drugtypes;

@RestController
public class DurglsxController {

	@Autowired
	private DurglsxSerive lsx;
	
	@RequestMapping("showDurgs")
	public Map showdurg(HttpServletRequest request) {
		Map map=new HashMap();
		int page1=Integer.parseInt(request.getParameter("page"));
		int rows1=Integer.parseInt(request.getParameter("rows"));
		//System.out.println(page1+"xxx"+rows1);
	    String durgname=request.getParameter("durgname");
	    String typeid=request.getParameter("typeid");
	  //  System.out.println(typeid+"idid");
		PageHelper.startPage(page1, rows1);
		
		Durg d=new Durg(durgname, Integer.parseInt(typeid));
		List<Durg> durgs_lsx = lsx.selcteDurgs_lsx(d);
		PageInfo info=new PageInfo<>(durgs_lsx);
		map.put("rows", durgs_lsx);
		map.put("total", info.getLastPage());
		return map;
	}
	
	@RequestMapping("showsType")
	public List<drugtypes> showsType(){
		
		List<drugtypes> list = lsx.showdurgtype_lsx();
		return list;
	}
	
	@RequestMapping("addsDurgs")
	public int addpurg(String durgname,String durgbarcode,String specifications,String durgunit,String durgbid,String durgprice,String durgtype,String manufacturer) {
		Durg durg=new Durg(1, durgname, durgbarcode, specifications, durgunit, durgbid, durgprice,Integer.parseInt(durgtype), manufacturer);
		int addDurglsx = lsx.addDurglsx(durg);
		
		return addDurglsx;
	}
	//删除药品
	@RequestMapping("delDurgs")
	public int delpurg(String ids) {
		int delDurgs_lsx = lsx.delDurgs_lsx(Integer.parseInt(ids));
		
		return delDurgs_lsx;
	}
	
	//修改药品查询id
	@RequestMapping("upDurgIDs")
	public Durg uppurgIDS(String ids) {
		Durg upDurgIDs_lsx = lsx.upDurgIDs_lsx(Integer.parseInt(ids));
		
		return upDurgIDs_lsx;
	}
	//修改药品
	@RequestMapping("UpDurgs")
	public int UPpurg(String durgid,String durgname,String durgbarcode,String specifications,String durgunit,String durgbid,String durgprice,String durgtype,String manufacturer) {
		Durg durg=new Durg(Integer.parseInt(durgid), durgname, durgbarcode, specifications, durgunit, durgbid, durgprice,Integer.parseInt(durgtype), manufacturer);
		int upsDurgslsx = lsx.UpsDurgslsx(durg);
		
		return upsDurgslsx;
	}
	
	//客户信息表查询
	@RequestMapping("showConsumers")
	public Map showConsumer(HttpServletRequest request) {
		Map map=new HashMap();
		int page1=Integer.parseInt(request.getParameter("page"));
		int rows1=Integer.parseInt(request.getParameter("rows"));
		//System.out.println(page1+"xxx"+rows1);
		String names=request.getParameter("names");
		String phone=request.getParameter("phones");
		
		PageHelper.startPage(page1, rows1);
		
		List<Consumer> consumer = lsx.selcteConsumers_lsx(names,phone);
		PageInfo info=new PageInfo<>(consumer);
		map.put("rows", consumer);
		map.put("total", info.getLastPage());
		return map;
	}
	   //修改药品查询id
		@RequestMapping("upConsumerIDs")
		public Consumer upConsumerIDS(String ids) {
			Consumer uplsx = lsx.upConsumerIDs_lsx(Integer.parseInt(ids));
			
			return uplsx;
		}
		//删除药品
		@RequestMapping("delConsumers")
		public int delConsumer(String ids) {
			int delConsumers_lsx = lsx.delConsumergs_lsx(Integer.parseInt(ids));
			
			return delConsumers_lsx;
		}
		
	//客户信息表查询
		@RequestMapping("showSuppliers")
		public Map showSupplier(HttpServletRequest request) {
			Map map=new HashMap();
			int page1=Integer.parseInt(request.getParameter("page"));
			int rows1=Integer.parseInt(request.getParameter("rows"));
			//System.out.println(page1+"xxx"+rows1);
			
			
			PageHelper.startPage(page1, rows1);
			
			List<Supplier> supplier = lsx.selcteSuppliers_lsx();
			PageInfo info=new PageInfo<>(supplier);
			map.put("rows", supplier);
			map.put("total", info.getLastPage());
			return map;
		}
		
		 //修改药品查询id
		@RequestMapping("upSupplierIDs")
		public Supplier upSupplierIDS(String ids) {
			Supplier uplsx = lsx.upSupplierIDs_lsx(Integer.parseInt(ids));
			
			return uplsx;
		}
		//删除药品
		@RequestMapping("delSuppliers")
		public int delSupplier(String ids) {
			int delSuppliers_lsx = lsx.delSuppliergs_lsx(Integer.parseInt(ids));
			
			return delSuppliers_lsx;
		}
		
		
		
		
		
		
		
		
		
}
