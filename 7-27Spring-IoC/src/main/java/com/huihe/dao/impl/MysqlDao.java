package com.huihe.dao.impl;

import com.huihe.dao.Dao;

public class MysqlDao implements Dao {



    @Override
    public void insert() {
        System.out.println("mysql insert");
    }

    @Override
    public void delete() {
        System.out.println("mysql delete");
    }

    @Override
    public void update() {
        System.out.println("mysql update");
    }

    @Override
    public void select() {
        System.out.println("mysql select");
    }
}
