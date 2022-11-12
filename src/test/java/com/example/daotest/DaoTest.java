package com.example.daotest;

import com.example.dao.IInfoDao;
import com.example.entity.Info;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoTest {
    @Autowired
    IInfoDao infoDao;
    @Test
    public void daoTest(){
        Info info=new Info();
        info.setMail("8888654@163.com");
        info.setName("111");
        info.setPhone("08-74147");
    }
}
