package com.caocaorbac.entity;

import lombok.Data;

import java.util.List;

//储存所有订单基本信息
@Data
public class OrderInfo {
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
    //用户手机号
    private String caller_phone;
    private String ext_uid;
    private int estimate_price;
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
    private double order_longitude;
    private double order_latitude;
    private String sms_policy;
    private String extra_info;
    private String callback_info;
    private String order_tags;
    private String line_type;

    private String accept_cp_driver;
    private boolean cpDriver;

    private String accept_relay_order;
    private boolean isRelayOrder;

    private String start_poi_id;
    private String end_poi_id;

    private String carpool_type;
    private String count_person;
    private boolean carpoolFlag;

    private String startServiceTime;
    private String beginChargeTime;
    private String departureTime;
    private String realStartAddress;
    private String realEndAddress;
    private String finishTime;
    private String payTime;
    private String canceledTime;
    /*
    "direction", "latitude", "longitude" are in "realStartLocation" hashmap
     */
    private String realStartLocation_longitude;
    private String realStartLocation_latitude;
    private double normalDistance;
    private int normalTime;
    private long orderId;
    private String order_time;
    private String status;
    private String striveTime;
    private String invoiced;
    private String invoiceStatus;
    private String realEndLocation_longitude;
    private String realEndLocation_latitude;
    private double longKm;
    private double nightKm;
    private int nightTime;
    private double travelKm;
    private String arrivedTime;
    private int personalPayMethod;
    private String companyNo;
    private int origin;
    //用车H5传入的第三方用户ID
    private String accid;
    private long carpoolOrderNo;
    private List<String> wayPointInfoList;

    private boolean sensitiveOrder;
    private List<String> sensitiveOrderRuleList;
    private String sensitiveOrderUserReason;
    private long ruleId;
    private String situationName;
    private String companyReason;
    private long driver_id;
    //driverInfoVo.serviceType 实际服务类型
    private String serviceType;

    //	司机位置纬度 	司机位置经度








}
