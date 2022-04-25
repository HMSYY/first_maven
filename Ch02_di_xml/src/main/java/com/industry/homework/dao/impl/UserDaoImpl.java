package com.industry.homework.dao.impl;

import com.industry.homework.dao.UserDao;
import com.industry.homework.doMain.SysUser;

public class UserDaoImpl implements UserDao {
    public void insertUser(SysUser user){
        System.out.println("执行了数据库的insert操作");
    }
}
