package com.summer.design.patterns.structural.proxy.trendsproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler{
    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录开始");
        method.invoke(object,args);
        System.out.println("记录结束");
        return null;
    }
}
