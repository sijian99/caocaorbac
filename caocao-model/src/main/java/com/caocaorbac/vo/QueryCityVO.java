package com.caocaorbac.vo;

import lombok.Data;

//根据经纬度查询所在的城市id
@Data
public class QueryCityVO {
    private String client_id;
    private long timestamp;
    //private String sign;
    private double longitude;
    private double latitude;
}
