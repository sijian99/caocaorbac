package com.caocaorbac.common.po;


import com.caocaorbac.common.dto.OrderDetailDTO;
import lombok.Data;

//储存所有订单基本信息
@Data
public class OrderInfo extends OrderDetailDTO {
    private String client_id;
    private long timestamp;
    private String sign;
    private String cost_center;
    private String from_longitude;
    private String from_latitude;
    private String to_longitude;
    private String to_latitude;
    private String car_type;
    private String ext_order_id;
    //乘车人手机号，不填表示给自己叫车
    private String passenger_phone;
    //手机号后四位
    private String passenger_hide_phone;
    private String passenger_name;

    private String estimate_price_key;
    private String city_code;
    private String order_type;
    private String dynamic_rule_id;
    private String flight_no;
    private String flt_takeoff_time;
    private String departure_time;


    private String sms_policy;
    private String extra_info;
    private String callback_info;
    private String order_tags;
    private String line_type;


    private String start_poi_id;
    private String end_poi_id;

    private String carpool_type;
    private String count_person;
    private boolean carpoolFlag;



    private long ruleId;
    private String situationName;
    private String companyReason;
    private long driver_id;
    //driverInfoVo.serviceType 实际服务类型
    private String serviceType;








}
