package com.industry.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

@Aspect
public class MyAspect {

    /**
     * 环绕通知
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("执行了环绕通知的myAround方法");

        //获取方法执行时的参数值
        String name = "";
        Object args[] = pjp.getArgs();
        if(args != null && args.length > 0){
            Object arg = args[0];
            if(arg != null){
                name = (String)arg;
            }
        }

        Object methodReturn = null;
        System.out.println("执行了环绕通知，在目标方法之前，输出日志时间 = " + new Date());

        //若执行时的形参name != "lisi"，则不执行目标方法;反之，则执行目标方法。
        if("lis".equals(name)){
            methodReturn = pjp.proceed();//表示执行doFirst方法本身
        }

        if(methodReturn != null){
            methodReturn = "环绕通知中，修改目标方法原来的执行结果";
        }

        System.out.println("环绕通知，在目标方法执行之后，增加了事务提交功能");

        //return "HelloAround，不是目标方法的执行结果";
        //返回目标方法没有修改的执行结果
        return methodReturn;
    }
}





















