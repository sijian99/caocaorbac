package com.caocaorbac.service.impl;

import com.caocaorbac.dto.CityInfoDTO;
import com.caocaorbac.mapper.CityInfoMapper;
import com.caocaorbac.service.CityInfoService;
//import com.caocaorbac.service.XxlService;

import com.google.gson.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;


import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CityInfoServiceImpl implements CityInfoService {

    @Autowired
    private CityInfoMapper cityInfoMapper;
//    @Autowired
//    private XxlService xxlService;
    @Autowired
    private RestTemplate restTemplate;

    public <T> List<T> getObjList(T t, String url, String parm){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        String body = responseEntity.getBody();
        JsonObject jsonObject = new JsonParser().parse(body).getAsJsonObject();

        JsonObject data = jsonObject.getAsJsonObject("data");
        JsonElement yourJson = data.get(parm);
        Type listType = new TypeToken<List<T>>() {}.getType();
        List<T> cityInfos = new Gson().fromJson(yourJson, listType);
        return cityInfos;
    }

    @Override
    public void saveCitiesInfo(){
        //需要传入参数:client_id,timestamp,sign
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:9090/mock/v2/common/getAllCities",String.class);
        String body = responseEntity.getBody();
        System.out.println(body);
        JsonObject jsonObject = new JsonParser().parse(body).getAsJsonObject();
        try{
            JsonObject data = jsonObject.getAsJsonObject("data");
            //JsonArray citiesArray = data.getAsJsonArray("cities");
            JsonElement yourJson = data.get("cities");
            Type listType = new TypeToken<List<CityInfoDTO>>() {}.getType();
            List<CityInfoDTO> cityInfos = new Gson().fromJson(yourJson, listType);
            cityInfoMapper.saveCitiesInfo(cityInfos);

        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }

//    @Override
//    public void saveCitiesInfo(){
//        CityInfoDTO cityInfoDTO = new CityInfoDTO();
//        List<CityInfoDTO> cityInfos = this.getObjList(cityInfoDTO, "/v2/common/getAllCities", "cities" );
//        try{
//            cityInfoMapper.saveCitiesInfo(cityInfos);
//        } catch (Exception e){
//            e.printStackTrace();
//            System.out.println(e);
//        }
//    }



}
