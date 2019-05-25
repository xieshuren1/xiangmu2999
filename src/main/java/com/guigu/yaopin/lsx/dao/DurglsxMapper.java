package com.guigu.yaopin.lsx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.guigu.yaopin.lsx.entity.Consumer;
import com.guigu.yaopin.lsx.entity.Durg;
import com.guigu.yaopin.lsx.entity.Supplier;
import com.guigu.yaopin.lsx.entity.drugtypes;

@Mapper
public interface DurglsxMapper {

	List<Durg> selcteDurgs_lsx(Durg d);
	
	List<drugtypes> showdurgtype_lsx();
	
	int addDurglsx(Durg durg);
	
	int delDurgs_lsx(int durgid);
	
	Durg upDurgIDs_lsx(int durgid);
	
	int UpsDurgslsx(Durg du);
	
	//客户信息添加
	int addsConsumer_lsx(Consumer consumer);
	
	List<Consumer> selcteConsumers_lsx(@Param("consumername")String consumername,@Param("consumerphone")String consumerphone);
	
	Consumer upConsumerIDs_lsx(int consumerid);
	
	int UpsConsumerslsx(Consumer consumer);
	
	int delConsumergs_lsx(int consumerid);
	
	//供应商
	List<Supplier> selcteSuppliers_lsx(Supplier s);
	
	Supplier upSupplierIDs_lsx(int supplierid);
	
	int  delSuppliergs_lsx(int supplierid);
	
	int addsSupplier_lsx(Supplier sup);
	
	int UpsSupplierslsx(Supplier sup);
	
}
