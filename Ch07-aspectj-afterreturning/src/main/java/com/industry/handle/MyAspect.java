package com.industry.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * 表示切面类
 */
@Aspect
public class MyAspect {

    /**
     * 后置通知方法的定义
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
    returning = "res")
    public void myAfterReturning(JoinPoint jp,Object res){

        //修改目标方法的返回值
        if(res != null){
            res = "Hello Aspectj";
        }
        System.out.println("后置通知，在目标方法之后执行的，能拿到执行结果：" + res);
        //Object res有什么用
        /*if("abcd".equals(res)){
            System.out.println("根据返回值的不同，做不同的增强功能");
        }else if("add".equals(res)){
            System.out.println("doOther做了添加数据库，我做了备份");
        }*/
    }
}






















