package org.spring.springboot.service.impl;

import org.spring.springboot.dao.master.CityDao;
import org.spring.springboot.daomain.City;
import org.spring.springboot.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @DESCRIPTION 城市业务逻辑接口实现
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;
    @Override
    public City findByName(String cityName) {
        return cityDao.findByName(cityName);
    }
}