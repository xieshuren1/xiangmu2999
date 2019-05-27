package com.guigu.yaopin.hjh.service;

import com.guigu.yaopin.hjh.dao.*;
import com.guigu.yaopin.hjh.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DrugServiceImpol implements DrugService {

	@Autowired
	private DrugtypeMapper dt;
	@Autowired
	private DurgMapper dr;
	@Autowired
	private StockMapper st;
	@Autowired
	private SupplierMapper sp;
	@Autowired
	private FinancialMapper fc;
	@Autowired
	private GostockMapper gk;

//查詢藥品類型
	@Override
	public List<Drugtype> drugtype() {
		DrugtypeExample e = new DrugtypeExample();
		List<Drugtype> drugtypes = dt.selectByExample(e);
	

		return drugtypes;
	}

//药品查询
	@Override
	public List<Durg> selectdrug(QueryVo tyid) {
		// TODO Auto-generated method s
		List<Durg> selectdrug = dr.selectdrug(tyid);
		return selectdrug;
	}

//药品的条数
	@Override
	public int countByExample(QueryVo v) {
		// TODO Auto-generated method stub

		return dr.countByExample(v);

	}

//藥品采購
	@Transactional
	@Override
	public int updateByPrimaryKeySelective(Stock s, Financial f, int supplierid,String format) {
		try {
			// 根据药品id查询出stock对象
			Stock stockdid = st.stockdid(s.getDid());
			// 添加财政记录表
			fc.insertSelective(f);
			// 根据时间查询财政几率的id
			Financial getdid = fc.getdid(format);
			// 添加入库记录
			gk.insertSelective(new Gostock(supplierid, getdid.getFinancialid()));
			// 如果查询的对象为空那么则把药品插入库存表
//			反之则修改库存
			if (stockdid == null) {

				return st.insertSelective(s);

			} else {

				stockdid.setStocknum(stockdid.getStocknum() + s.getStocknum());

				return st.updateByPrimaryKeySelective(stockdid);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}

	// 查询供货商表
	public List<Supplier> selectByExamplesupplier() {
		SupplierExample example = new SupplierExample();
		List<Supplier> selectByExample = sp.selectByExample(example);
		return selectByExample;
	}

	@Override
	public int selectdurgnamecount(QueryVo tyid) {
		// TODO Auto-generated method stub
		
		return dr.selectdurgnamecount(tyid);
	}

	@Override
	public List<Durg> selectdurgname(QueryVo tyid) {
		// TODO Auto-generated method stub
		return dr.selectdurgname(tyid);
	}
}
