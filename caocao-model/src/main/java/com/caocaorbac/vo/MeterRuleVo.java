package com.caocaorbac.vo;

import lombok.Data;

//计价规则查询
@Data
public class MeterRuleVo {
    private String client_id;
    private long timestamp;
    private String sign;
    /*服务车型*/
    private int car_type;
    private String city_code;
    private int order_type;
    private double longitude;
    private double latitude;
}
