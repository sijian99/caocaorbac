package com.caocaorbac.web;

import com.alibaba.fastjson.JSONObject;
import com.caocaorbac.service.CityInfoService;
import com.caocaorbac.vo.GetAllCitiesVO;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//所有从曹操拉取数据的接口
@RestController
public class FetchDataController {
    @Autowired
    private CityInfoService cityInfoService;

    /*从曹操拉取城市服务开通状态并保存*/
    @RequestMapping("/saveAllCitiesInfo")
    public void getAllCities(GetAllCitiesVO getAllCitiesVO) {
        String getAllCitiesURL = " /v2/common/getAllCities";
        CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();
        try {
            HttpGet httpGet = new HttpGet(getAllCitiesURL);
            CloseableHttpResponse response = closeableHttpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String allCites = EntityUtils.toString(entity);

            //将String解析后批量存入自己的database
            cityInfoService.saveAllCities(allCites);
        } catch (Exception e){

        }
        
    }
        
        
        











      



}
