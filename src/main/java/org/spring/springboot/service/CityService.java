package org.spring.springboot.service;

import org.spring.springboot.daomain.City;

/**
 * @DESCRIPTION 城市业务逻辑接口
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
public interface CityService {
    public City findByName(String cityName);
}
