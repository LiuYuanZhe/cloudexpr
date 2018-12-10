package com.cun.provider.pattern.proxy;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLClassLoader;

/**
 * Created by LiuYuanZhe on 2018/12/3.
 */
public class DynamicProxyPerson implements InvocationHandler{
    private Shopping shopping;
    private final String methodName = "buySomething";
    public DynamicProxyPerson(Shopping shop){
        this.shopping = shop;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;
        if(StringUtils.equals(methodName,method.getName())){
            obj = method.invoke(shopping,args);
        }
        return obj;
    }

    public static void main(String[] args) {
        Shopping shopping = (Shopping) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Shopping.class},new DynamicProxyPerson(new ExecutePerson("牛大")));
        shopping.buySomething();
        ClassLoader clzLoader;
    }
}
