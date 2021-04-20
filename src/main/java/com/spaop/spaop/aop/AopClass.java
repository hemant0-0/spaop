package com.spaop.spaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopClass {

    @Before("execution(* com.spaop.spaop.impl.MyImpl.getData())")
    public void checkAop(){
        System.out.println("Before advice execution");
    }

    @After("execution(* com.spaop.spaop.impl.MyImpl.getData())")
    public void checkAop2(){
        System.out.println("After advice execution");
    }
}
