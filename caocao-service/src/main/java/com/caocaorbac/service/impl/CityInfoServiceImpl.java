package com.caocaorbac.service.impl;

//import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.caocaorbac.dto.CityInfoDTO;
import com.caocaorbac.mapper.CityInfoMapper;
import com.caocaorbac.service.CityInfoService;
import com.caocaorbac.service.XxlService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class CityInfoServiceImpl implements CityInfoService {

    @Autowired
    private CityInfoMapper cityInfoMapper;
    @Autowired
    private XxlService xxlService;

    private RestTemplate restTemplate;

    @Override
    public void saveCitiesInfo(){
        //需要传入参数:client_id,timestamp,sign
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/v2/common/getAllCities",String.class);
        String body = responseEntity.getBody();
        JSONObject json = JSONObject.parseObject(body);
        JSONObject data = json.getJSONObject("data");
        JSONArray jsonArray = data.getJSONArray("cities");

        List<CityInfoDTO> cityInfos = jsonArray.toJavaList(CityInfoDTO.class);

        cityInfoMapper.saveCitiesInfo(cityInfos);


    }
}
