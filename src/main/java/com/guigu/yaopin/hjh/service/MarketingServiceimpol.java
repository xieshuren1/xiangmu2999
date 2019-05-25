package com.guigu.yaopin.hjh.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guigu.yaopin.hjh.dao.ConsumerMapper;
import com.guigu.yaopin.hjh.dao.DurgMapper;
import com.guigu.yaopin.hjh.dao.FinancialMapper;
import com.guigu.yaopin.hjh.dao.SellMapper;
import com.guigu.yaopin.hjh.dao.StockMapper;
import com.guigu.yaopin.hjh.entity.Consumer;
import com.guigu.yaopin.hjh.entity.ConsumerExample;
import com.guigu.yaopin.hjh.entity.Durg;
import com.guigu.yaopin.hjh.entity.Financial;
import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.entity.Sell;
import com.guigu.yaopin.hjh.entity.Stock;
import com.guigu.yaopin.xsr.doamin.users;

@Service
public class MarketingServiceimpol implements MarketingService {
	@Autowired
	private DurgMapper dru;
	@Autowired
	private SellMapper com;
	@Autowired
	private ConsumerMapper ct;
	@Autowired
	private FinancialMapper fm;
	@Autowired
	private StockMapper sm;

	@Override
	public List<Durg> getstock(QueryVo tyid) {
		// TODO Auto-generated method stub
		List<Durg> getstock = dru.getstock(tyid);
		return getstock;
	}

	@Override
	public int getstockcount(QueryVo tyid) {
		// TODO Auto-generated method stub

		return dru.getstockcount(tyid);
	}

	@Override
	public List<Consumer> getconsumer() {
		// TODO Auto-generated method stub
		ConsumerExample example = new ConsumerExample();
		List<Consumer> selectByExample = ct.selectByExample(example);
		return selectByExample;
	}

	// 添加销售记录
	
	@Transactional
	@Override
	public int getmarketing(int stocknum ,int money ,int durgid,int muser,int  payment,int paymentmoney,HttpSession session) {
		// TODO Auto-generated method stub
		try {
			users u = (users) session.getAttribute("user_us");
			String getdate = getdate();
			Financial f = new Financial(durgid, u.getUserid(), stocknum, getdate, String.valueOf(money), 2);
			fm.insertSelective(f);
			Financial fan = fm.getdid(getdate);
			Sell s = new Sell(muser, fan.getFinancialid(), payment);
			com.insertSelective(s);
			Stock smk = sm.stockdid(durgid);
			smk.setStocknum(smk.getStocknum() - stocknum);
			sm.updateByPrimaryKeySelective(smk);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}

	}

	// 当前时间字符串
	public String getdate() {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		return format;

	}

}
