package com.huan.map.mapper;

import com.huan.map.model.BaseStationRadiation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 郇冲
 * @Date 2021/9/5
 */
@Mapper
@Repository
public interface BaseStationRadiationMapper {
    List<BaseStationRadiation> findAll();

    List<BaseStationRadiation> findOneByLatAndLong(double latitude, double longitude);


    List<BaseStationRadiation> findOneByAllParameters(double latitude, double longitude,int distance,String provider);
}
