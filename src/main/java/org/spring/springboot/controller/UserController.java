package org.spring.springboot.controller;

import org.spring.springboot.result.ResultBody;
import org.spring.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @DESCRIPTION user   controller层
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/api/user",method = RequestMethod.GET)
    public ResultBody findAllUser(){
        ResultBody resultBody = new ResultBody(userService.findAllUser());
        return resultBody;
    }
}
