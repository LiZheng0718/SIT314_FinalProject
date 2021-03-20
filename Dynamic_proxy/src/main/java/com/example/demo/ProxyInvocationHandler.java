package com.example.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
   //被代理的接口
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }
    //生成的到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);

    }
    //处理得到代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       log(method.getName());
       Object result = method.invoke(target,args);
       return result;
    }
    public void log(String msg){
        System.out.println("执行了"+msg);
    }
}
