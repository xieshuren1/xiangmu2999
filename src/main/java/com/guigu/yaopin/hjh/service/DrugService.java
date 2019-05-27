package com.guigu.yaopin.hjh.service;

import com.guigu.yaopin.hjh.entity.*;

import java.util.List;

public interface DrugService {
   List<Drugtype> drugtype();
   List<Durg> selectdrug(QueryVo v);
   int countByExample(QueryVo v);
    int  updateByPrimaryKeySelective(Stock s,Financial f,int supplierid,String format);
    List<Supplier>  selectByExamplesupplier();
    int  selectdurgnamecount(QueryVo tyid);
    List<Durg>   selectdurgname(QueryVo tyid);
}
