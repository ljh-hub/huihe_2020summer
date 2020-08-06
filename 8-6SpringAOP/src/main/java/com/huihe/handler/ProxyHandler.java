package com.huihe.handler;


import com.huihe.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProxyHandler implements InvocationHandler {

    private Object object;
    public ProxyHandler(Object object){
        this.object = object;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{UserService.class}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("[info] "+new SimpleDateFormat("yyyy-MM-dd").format(new Date()) +" 执行了"+method.getName()+"方法。");
        Object result = method.invoke(object, args);
        return result;
    }
}
