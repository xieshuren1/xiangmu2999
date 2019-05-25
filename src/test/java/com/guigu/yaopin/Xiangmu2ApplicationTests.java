package com.guigu.yaopin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guigu.yaopin.hjh.dao.DurgMapper;
import com.guigu.yaopin.hjh.dao.GostockMapper;
import com.guigu.yaopin.hjh.dao.SellMapper;
import com.guigu.yaopin.hjh.entity.Gostock;
import com.guigu.yaopin.hjh.entity.QueryVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Xiangmu2ApplicationTests {
	@Autowired
	SellMapper d;
    @Test
    public void contextLoads() {
    	
    	System.out.println(d.getsellid(5));
    }

}
