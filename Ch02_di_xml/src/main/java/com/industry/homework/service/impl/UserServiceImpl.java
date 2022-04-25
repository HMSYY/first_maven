package com.industry.homework.service.impl;

import com.industry.homework.dao.UserDao;
import com.industry.homework.dao.impl.UserDaoImpl;
import com.industry.homework.doMain.SysUser;
import com.industry.homework.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = null;//赋值在配置文件中做，模块间更松散，灵活度更高

    public void addUser(SysUser user){
        userDao.insertUser(user);
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
