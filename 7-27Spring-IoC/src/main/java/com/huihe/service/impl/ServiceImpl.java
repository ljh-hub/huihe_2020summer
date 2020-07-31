package com.huihe.service.impl;

import com.huihe.dao.Dao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceImpl {
    Dao dao;

    @Test
    public void insert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        dao = (Dao) context.getBean("dao");
        dao.insert();
        //TODO
    }
}
