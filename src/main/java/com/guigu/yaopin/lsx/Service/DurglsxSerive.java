package com.guigu.yaopin.lsx.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guigu.yaopin.lsx.entity.Consumer;
import com.guigu.yaopin.lsx.entity.Durg;
import com.guigu.yaopin.lsx.entity.Supplier;
import com.guigu.yaopin.lsx.entity.drugtypes;

public interface DurglsxSerive {

       List<Durg> selcteDurgs_lsx(Durg d); //查询药品信息
	
       List<drugtypes> showdurgtype_lsx(); //查询药品类型
	
	   int addDurglsx(Durg durg);//新增药品
	
	   int delDurgs_lsx(int durgid);//删除药品
	
	   Durg upDurgIDs_lsx(int durgid); //修改药品信息查询
	
	   int UpsDurgslsx(Durg du);//修改药品信息
	
	   //客户信息添加
		int addsConsumer_lsx(Consumer consumer);
		
		List<Consumer> selcteConsumers_lsx(String consumername,String consumerphone);
		
		Consumer upConsumerIDs_lsx(int consumerid);
		
		int delConsumergs_lsx(int consumerid);
		
		int UpsConsumerslsx(Consumer consumer);
		
		//供应商
		List<Supplier> selcteSuppliers_lsx();
		
		Supplier upSupplierIDs_lsx(int supplierid);
		
		int  delSuppliergs_lsx(int supplierid);
		
		int addsSupplier_lsx(Supplier sup);
		
		int UpsSupplierslsx(Supplier sup);
}
