package com.caocaorbac.common.vo;

import lombok.Data;

//下单叫车,发起叫车请求
@Data
public class OrdercarVo {
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
    private String passenger_phone;
    private String passenger_hide_phone;
    private String passenger_name;
    private String caller_phone;
    private String ext_uid;
    private String estimate_price;
    private String estimate_price_key;
    private String city_code;
    private String order_type;
    private String dynamic_rule_id;
    private String flight_no;
    private String flt_takeoff_time;
    private String departure_time;
    private String start_name;
    private String start_address;
    private String end_name;
    private String end_address;
    private String order_longitude;
    private String order_latitude;
    private String sms_policy;
    private String extra_info;
    private String callback_info;
    private String order_tags;
    private String line_type;
    private String accept_cp_driver;
    private String accept_relay_order;
    private String start_poi_id;
    private String end_poi_id;
    private String carpool_type;
    private String count_person;
}
