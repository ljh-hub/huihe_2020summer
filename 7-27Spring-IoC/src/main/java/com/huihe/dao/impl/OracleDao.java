package com.huihe.dao.impl;

import com.huihe.dao.Dao;

public class OracleDao implements Dao {
    //public OracleDao(){}
    public OracleDao(){
    }
    @Override
    public void insert() {
        System.out.println("Oracle insert");
    }

    @Override
    public void delete() {
        System.out.println("Oracle delete");
    }

    @Override
    public void update() {
        System.out.println("Oracle update");
    }

    @Override
    public void select() {
        System.out.println("Oracle select");
    }
}
