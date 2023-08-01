package com.caocaorbac.controller;

import com.caocaorbac.service.CityInfoService;

import com.caocaorbac.service.impl.FetchDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//所有从曹操拉取数据的接口
@RestController
public class MockController {
    @Autowired
    private CityInfoService cityInfoService;

    @Autowired
    private FetchDataService fetchDataService;


    /** 从mock表获取 saveCitiesInfo 的返回值**/
    @RequestMapping(value="mock/v2/common/getAllCities",method= RequestMethod.GET)
    public String mockGetData(){
         return fetchDataService.mockGetData();
    }






}
