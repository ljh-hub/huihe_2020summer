package com.huihe.proxy;

import com.huihe.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }

    @Override
    public void insert() {
        log("insert");
        userService.insert();
    }

    @Override
    public void select() {
        log("select");
        userService.select();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    private void log(String msg){
        System.out.println("[Info] "+new SimpleDateFormat("yyyy-MM-dd").format(new Date()) +" 执行了"+msg+"方法");
    }
}
