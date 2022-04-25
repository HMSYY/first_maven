package com.industry.proxy;

import com.industry.Service.impl.SomeServiceImpl;
import com.industry.SomeService;

import java.util.Date;

/**
 * 调用ServiceProxy类的方法的时候，调用真正的目标方法，
 * 调用目标方法的时候，增加了一些功能。
 *
 * ServiceProxy叫做代理，代理对目标的操作。
 *
 * 创建代理，可以完成对目标方法的调用，增减功能。
 * 保持目标方法内容不变。
 */
public class ServiceProxy implements SomeService {

    //定义目标类的对象，调用它的方法，为核心业务功能
    SomeService target = new SomeServiceImpl();

    @Override
    public void doSome(String name,Integer age) {

        //增加额外功能，原始功能没有变
        System.out.println("日志功能，记录方法的执行时间 = " + new Date());
        target.doSome("lisi",20);
        System.out.println("事务功能，业务方法之后，提交事务" );
    }

    @Override
    public void doOther() {

        target.doOther();
    }
}
/**
 * execution(public void com.industry.proxy.ServiceProxy.doSome(String,Integer))
 * execution(public * *(..))
 *
 * execution(void doSome(String,Integer))
 */


















