package com.cun.provider.pattern.proxy;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLClassLoader;

/**
 * 所谓动态代理可以不必强行指定某个真实的角色，只需要在运行时决定就可以了。这里我们可以使用JDK中java.lang.reflect来进行开发。
 * JDK对动态代理提供了以下支持:

 java.lang.reflect.Proxy 动态生成代理类和对象
 java.lang.reflect.InvocationHandler

 可以通过invoke方法实现对真实角色的代理访问;
 每次通过Proxy生成代理类对象时都要指定对象的处理器对象.


 代理模式优点：

 1、职责清晰。 2、高扩展性。 3、智能化。

 代理模式缺点：

 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。

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
