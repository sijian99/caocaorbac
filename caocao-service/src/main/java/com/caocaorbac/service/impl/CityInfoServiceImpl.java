package com.caocaorbac.service.impl;

import com.caocaorbac.dao.CityInfoMapper;
import com.caocaorbac.service.CityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityInfoServiceImpl implements CityInfoService {

    @Autowired
    private CityInfoMapper cityInfoMapper;


    @Override
    public void saveAllCities(String allCities){
        //获取返回结果data中的list,然后批量插入

         cityInfoMapper.saveAllCities(allCities);

    }
}
