package org.spring.springboot.service;

import org.spring.springboot.daomain.User;

import java.util.List;

/**
 * @DESCRIPTION 员工 service逻辑接口
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
public interface UserService {

    public List<User> findAllUser();


}
