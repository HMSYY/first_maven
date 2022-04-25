package com.industry;

import com.industry.homework.doMain.SysUser;
import com.industry.homework.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTestHomework {

    @Test
    public void test(){

        String config = "homework/applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        UserServiceImpl service = (UserServiceImpl) ctx.getBean("userService");

        //user是人为操作进去的，动态的，没必要放在bean中，直接声明对象。
        SysUser user = new SysUser();
        user.setName("jisi");
        user.setAge(20);
        service.addUser(user);
    }
}
