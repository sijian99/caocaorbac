package com.caocaorbac.controller;


import com.caocaorbac.dto.CityInfoDTO;
import com.caocaorbac.mapper.CityInfoMapper;
import com.caocaorbac.service.CityInfoService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    private CityInfoMapper cityInfoMapper;

    @RequestMapping(value="test/savecities",method= RequestMethod.GET)
    public void testSaveCitiesInfo(){
        String test = "{\"code\":200,\"data\":{\"cities\":[{\"luxurious\":0,\"commercial\":0,\"cityName\":\"营口\",\"economic_business\":0,\"cityCode\":\"0417\",\"comfortable\":0,\"newEnergy\":1,\"taxi\":0,\"choiceness\":0},{\"luxurious\":0,\"commercial\":0,\"cityName\":\"无锡\",\"economic_business\":0,\"cityCode\":\"0510\",\"comfortable\":0,\"newEnergy\":1,\"taxi\":0,\"choiceness\":0}]},\"success\":true}";
        JsonObject jsonObject = new JsonParser().parse(test).getAsJsonObject();
        JsonObject data = jsonObject.getAsJsonObject("data");
        //JsonArray citiesArray = data.getAsJsonArray("cities");
        JsonElement yourJson = data.get("cities");
        Type listType = new TypeToken<List<CityInfoDTO>>() {}.getType();
        List<CityInfoDTO> cityInfos = new Gson().fromJson(yourJson, listType);
        cityInfoMapper.saveCitiesInfo(cityInfos);
    }


}
