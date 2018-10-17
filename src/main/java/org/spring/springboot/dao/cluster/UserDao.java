package org.spring.springboot.dao.cluster;

import org.spring.springboot.daomain.User;

import java.util.List;

/**
 * @DESCRIPTION 员工dao接口
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
public interface UserDao {

    public List<User> findAllUser();
}
