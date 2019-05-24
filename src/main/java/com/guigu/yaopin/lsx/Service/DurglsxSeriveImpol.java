package com.guigu.yaopin.lsx.Service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.lsx.dao.DurglsxMapper;
import com.guigu.yaopin.lsx.entity.Consumer;
import com.guigu.yaopin.lsx.entity.Durg;
import com.guigu.yaopin.lsx.entity.Supplier;
import com.guigu.yaopin.lsx.entity.drugtypes;

@Service
public class DurglsxSeriveImpol implements DurglsxSerive {

	@Autowired
	private DurglsxMapper dd;
	
	@Override
	public List<Durg> selcteDurgs_lsx(Durg d) {
		List<Durg> durgs_lsx = dd.selcteDurgs_lsx(d);
		return durgs_lsx;
	}

	@Override
	public List<drugtypes> showdurgtype_lsx() {
		List<drugtypes> list = dd.showdurgtype_lsx();
		return list;
	}

	@Override
	public int addDurglsx(Durg durg) {
		int addDurglsx = dd.addDurglsx(durg);
		return addDurglsx;
	}

	@Override
	public int delDurgs_lsx(int durgid) {
		int i = dd.delDurgs_lsx(durgid);
		return i;
	}

	@Override
	public Durg upDurgIDs_lsx(int durgid) {
		Durg upDurgIDs_lsx = dd.upDurgIDs_lsx(durgid);
		return upDurgIDs_lsx;
	}

	@Override
	public int UpsDurgslsx(Durg du) {
		int upsDurgslsx = dd.UpsDurgslsx(du);
		return upsDurgslsx;
	}

	@Override
	public int addsConsumer_lsx(Consumer consumer) {
		int addsConsumer_lsx = dd.addsConsumer_lsx(consumer);
		return addsConsumer_lsx;
	}

	@Override
	public List<Consumer> selcteConsumers_lsx(String consumername,String consumerphone) {
		List<Consumer> selcteConsumers_lsx = dd.selcteConsumers_lsx(consumername,consumerphone);
		return selcteConsumers_lsx;
	}

	@Override
	public Consumer upConsumerIDs_lsx(int consumerid) {
		Consumer upConsumerIDs_lsx = dd.upConsumerIDs_lsx(consumerid);
		return upConsumerIDs_lsx;
	}

	@Override
	public int delConsumergs_lsx(int consumerid) {
		int delConsumergs_lsx = dd.delConsumergs_lsx(consumerid);
		return delConsumergs_lsx;
	}

	@Override
	public int UpsConsumerslsx(Consumer consumer) {
		int upsConsumerslsx = dd.UpsConsumerslsx(consumer);
		return upsConsumerslsx;
	}

	@Override
	public List<Supplier> selcteSuppliers_lsx() {
		List<Supplier> selcteSuppliers_lsx = dd.selcteSuppliers_lsx();
		return selcteSuppliers_lsx;
	}

	@Override
	public Supplier upSupplierIDs_lsx(int supplierid) {
		Supplier upSupplierIDs_lsx = dd.upSupplierIDs_lsx(supplierid);
		return upSupplierIDs_lsx;
	}

	@Override
	public int delSuppliergs_lsx(int supplierid) {
		int delSuppliergs_lsx = dd.delSuppliergs_lsx(supplierid);
		return delSuppliergs_lsx;
	}

	@Override
	public int addsSupplier_lsx(Supplier sup) {
		int addsSupplier_lsx = dd.addsSupplier_lsx(sup);
		return addsSupplier_lsx;
	}

	@Override
	public int UpsSupplierslsx(Supplier sup) {
		int upsSupplierslsx = dd.UpsSupplierslsx(sup);
		return upsSupplierslsx;
	}

}
