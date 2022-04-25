package com.industry.handler;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CheckArgumentAspect {

    @Pointcut(value = "execution(public Integer com.industry.service.impl.NumberServiceImpl.addInteger(..))")
    public void mypt(){
        //无需代码
    }

    @Around(value = "mypt()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("执行了环绕通知myAspect");

        //选择布尔数做标记！！！(true表示参数正确的)
        boolean isAll = true;
        Object res = null;

        //获取目标参数执行时的参数
        Object[] args = pjp.getArgs();

        //判断参数符合条件
        for(Object arg : args){
            if(arg == null){
                isAll = false;
                break;
            }else{
                //参数不为空
                //取一个暂时的变量装整形的参数
                Integer temp = (Integer) arg;
                if(temp.intValue() <= 0){
                    isAll = false;
                    break;
                }
            }
        }

        //根据参数检查的结果，决定是否执行目标方法
        if(isAll){
            //参数正确，则调用目标方法
            res = pjp.proceed();
        }else {
            //参数不正确，则返回-1
            res = -1;
        }

        return res;
    }
}





















