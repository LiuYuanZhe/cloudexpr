package com.cun.register.aspact;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by LiuYuanZhe on 18/11/20.
 */
@Component
@Aspect
public class AopTest {

    @Pointcut("@annotation(com.cun.register.aspact.TestAnnotation)")
    public void executeService(){
    }
    @Around("executeService()")
    public Object around2(ProceedingJoinPoint point){
        Object obj = null;
        Object[] args = point.getArgs();
        try {
            obj = point.proceed();
            System.out.println(obj+"==========================");
        }catch (Throwable ex){

        }
        return obj;
    }
}
