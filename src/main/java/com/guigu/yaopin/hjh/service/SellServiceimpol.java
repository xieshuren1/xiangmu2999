package com.guigu.yaopin.hjh.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.yaopin.hjh.dao.FinancialMapper;
import com.guigu.yaopin.hjh.dao.ReturngoodsMapper;
import com.guigu.yaopin.hjh.dao.SellMapper;
import com.guigu.yaopin.hjh.dao.StockMapper;
import com.guigu.yaopin.hjh.entity.Financial;
import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.entity.Returngoods;
import com.guigu.yaopin.hjh.entity.Sell;
import com.guigu.yaopin.hjh.entity.Stock;
import com.guigu.yaopin.xsr.doamin.users;
@Service
public class SellServiceimpol implements SellService{
	@Autowired
private 	SellMapper sell;
	@Autowired
private 	StockMapper  stk;
	@Autowired
	private FinancialMapper fm;
	@Autowired
	private ReturngoodsMapper rg;
	
	
	@Override
	public List<Sell> getsell(QueryVo v) {
		// TODO Auto-generated method stub
	
		return 	sell.getsell( v);
	}
	@Override
	public int getsellcount(QueryVo v) {
		// TODO Auto-generated method stub
		
		
		return sell.getsellcount(v);
	}
	@Override
	public int getsellnext(int  sellid,int number,HttpSession session,int fmoney) {
		//拿到sell对象
		try {
			users u = (users) session.getAttribute("user_us");
			Sell s = sell.getsellid(sellid);
			Integer durgid = s.getF().getD().getDurgid();
			
			Financial f = new Financial(durgid, u.getUserid(), number, getdate(), String.valueOf(fmoney), 3);
			fm.insertSelective(f);
			Financial getdid = fm.getdid(getdate());
			Returngoods re=new Returngoods(sellid,getdid.getFinancialid());
			rg.insertSelective(re);	
			Financial f2 = s.getF();
			f2.setNum(f2.getNum()-number);
			fm.updateByPrimaryKeySelective(f2);
			sell.updateByPrimaryKeySelective(new Sell(sellid,s.getC().getConsumerid(),f2.getFinancialid()));
			Stock stock= stk.stockdid(durgid);
			stock.setStocknum(stock.getStocknum()+number);
			 stk.updateByPrimaryKeySelective(stock);
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
