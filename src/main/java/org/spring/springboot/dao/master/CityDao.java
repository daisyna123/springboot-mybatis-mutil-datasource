package org.spring.springboot.dao.master;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.daomain.City;

/**
 * @DESCRIPTION
 * @AUTHER administrator zhangna
 * @create 2018-09-29
 */
public interface CityDao {
    City findByName(@Param("cityName") String cityName);
}
