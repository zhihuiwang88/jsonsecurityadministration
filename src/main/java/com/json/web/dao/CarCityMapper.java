package com.json.web.dao;

import com.json.web.entity.CarCity;
import com.json.web.entity.CarCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarCityMapper {
    /**
     * countByExample
     */
    int countByExample(CarCityExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(CarCityExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer cityId);

    /**
     * insert
     */
    int insert(CarCity record);

    /**
     * insertSelective
     */
    int insertSelective(CarCity record);

    /**
     * selectByExample
     */
    List<CarCity> selectByExample(CarCityExample example);

    /**
     * selectByPrimaryKey
     */
    CarCity selectByPrimaryKey(Integer cityId);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") CarCity record, @Param("example") CarCityExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") CarCity record, @Param("example") CarCityExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(CarCity record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(CarCity record);
}