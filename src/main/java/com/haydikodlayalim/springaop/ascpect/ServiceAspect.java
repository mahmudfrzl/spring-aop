package com.haydikodlayalim.springaop.ascpect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    @Before("execution(* com.haydikodlayalim.springaop.service.*.*(..))")
    public void messageSendBefore(JoinPoint joinPoint){
        System.out.println("Metotdan once calisti" +joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }
    @After("execution(* com.haydikodlayalim.springaop.service.*.*(..))")
    public void messageSendAfter(JoinPoint joinPoint){
        System.out.println("Metotdan sonra calisti" +joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }
}
