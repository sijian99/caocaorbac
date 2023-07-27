package com.caocaorbac.service.impl;

import com.caocaorbac.mapper.CityInfoMapper;
import com.caocaorbac.mapper.MockMapper;
import com.caocaorbac.service.CityInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FetchDataService {
    @Autowired
    MockMapper mockMapper;
        public String mockGetData(){
        return mockMapper.mockGetData("saveCitiesInfo");
    }
}
