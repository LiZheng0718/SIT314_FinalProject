package com.example.demo.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class beforelog implements MethodBeforeAdvice {
    @Override
    //method:要执行的目标对象的参数
    //args: 参数
    //target： 目标对象
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+' '+method.getName()+"has been done");
    }
}
