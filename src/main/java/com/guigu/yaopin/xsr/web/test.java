package com.guigu.yaopin.xsr.web;

import com.guigu.yaopin.xsr.doamin.users;
import com.guigu.yaopin.xsr.service.YaopinService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class test {
    int  j=10;

    @Autowired
    private YaopinService im;
    @Test
    public void fff(){
        ByteSource bytes = ByteSource.Util.bytes("admin");
        SimpleHash hash = new SimpleHash("MD5","123456",bytes,1234);
       System.out.println(hash.toString());
    }


}
