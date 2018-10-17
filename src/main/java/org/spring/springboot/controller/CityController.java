package org.spring.springboot.controller;

import org.spring.springboot.result.ResultBody;
import org.spring.springboot.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @DESCRIPTION 城市contrller
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
@RestController
public class CityController {

    @Resource
    private CityService cityService;
    @RequestMapping("/api/city")
    public ResultBody findByName(@RequestParam("cityName")String cityName){
        ResultBody resultBody = new ResultBody(cityService.findByName(cityName));
        return resultBody;
    }
}
