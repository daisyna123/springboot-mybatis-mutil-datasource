package org.spring.springboot.service.impl;

import org.spring.springboot.dao.cluster.UserDao;
import org.spring.springboot.daomain.User;
import org.spring.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @DESCRIPTION 员工业务逻辑实现类
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}