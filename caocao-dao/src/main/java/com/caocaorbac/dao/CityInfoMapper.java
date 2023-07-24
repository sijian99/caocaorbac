package com.caocaorbac.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CityInfoMapper {
    void saveAllCities(String allCities);

}
