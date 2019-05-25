package com.guigu.yaopin.hjh.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guigu.yaopin.hjh.dao.DurgrejectionMapper;
import com.guigu.yaopin.hjh.dao.FinancialMapper;
import com.guigu.yaopin.hjh.dao.GostockMapper;
import com.guigu.yaopin.hjh.dao.StockMapper;
import com.guigu.yaopin.hjh.entity.Durgrejection;
import com.guigu.yaopin.hjh.entity.Financial;
import com.guigu.yaopin.hjh.entity.Gostock;
import com.guigu.yaopin.hjh.entity.QueryVo;
import com.guigu.yaopin.hjh.entity.Stock;
import com.guigu.yaopin.xsr.doamin.users;

@Service
public class DurgRejetionimpol implements DurgRejection {

	@Autowired
	private GostockMapper gotom;
	@Autowired
	private StockMapper st;
	@Autowired
	private DurgrejectionMapper dj;
	@Autowired
	private FinancialMapper fc;

	public List<Gostock> getgostocklist(QueryVo v) {

		return gotom.getgostocklist(v);

	}

	@Override
	public int getgostocklistcount(QueryVo v) {
		// TODO Auto-generated method stub

		return gotom.getgostocklistcount(v);
	}

//采购退货
	@Transactional
	@Override // 仓库记录编号 退货数量
	public int durgrejection(int bianhao, int shuliang, String jine, HttpSession session) {

		try {

			// TODO Auto-generated method stub
			// 拿到用户对象
			users u = (users) session.getAttribute("user_us");
			// 根据仓库编号拿到仓库记录对象

			Gostock g = gotom.getgostock(bianhao);
			// 拿到商品id
			Integer did = g.getF().getD().getDurgid();
			String getdate = getdate();
			String getmoney = getmoney(g, shuliang);
			// 财政支收表加数据
			Financial f = new Financial(did, u.getUserid(), shuliang, getdate, getmoney, 4);

			fc.insertSelective(f);

			Stock s = st.stockdid(did);
			s.setStocknum(s.getStocknum() - shuliang);
			st.updateByPrimaryKeySelective(s);

			Financial getdid = fc.getdid(getdate);
			Durgrejection dgj = new Durgrejection(bianhao, getdid.getFinancialid());
			dj.insertSelective(dgj);
			return 1;
		} catch (Exception e) {
			return 0;// TODO: handle exception
		}

	}

//当前时间字符串
	public String getdate() {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(date);
		return format;

	}

//算出财政收支money
	public String getmoney(Gostock g, int shuliang) {

		String durgbid = g.getF().getD().getDurgbid();
		double parseDouble = Double.parseDouble(durgbid);
		int parseInt = (int) parseDouble;
		int money = shuliang * parseInt;
		Double moneys = (double) money;
		String getm = String.valueOf(moneys);
		return getm;

	}

}
