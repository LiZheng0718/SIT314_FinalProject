package com.example.demo.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class afterlog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("execute"+method.getName()+"and result is"+returnValue);
    }
}
