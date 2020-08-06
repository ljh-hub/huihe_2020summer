package com.huihe.service.impl;

import com.huihe.service.UserService;


public class UserServiceImpl implements UserService {

    @Override
    public void insert() {
        System.out.println("insert");
    }

    @Override
    public void select() {
        System.out.println("select");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
