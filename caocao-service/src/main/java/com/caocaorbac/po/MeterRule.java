package com.caocaorbac.po;

import lombok.Data;

//储存所有城市中，不同车型，不同订单类型的收费标准
@Data
public class MeterRule {
    private String city_code;
    private int order_type;
    private int car_type;

    private int carTypeCode;
    private String carTypeDesc;
    private int startPrice_basePrice;
    /* 描述，起步价 */
    private String startPrice_desc;
    /* 起步公里数 */
    private double startPrice_startIncludeKm;
    /* 起步分钟数 */
    private int startPrice_startIncludeMinute;

    private int kmPrice_basePrice;
    private String kmPrice_desc;
    private int timePrice_basePrice;
    private String timePrice_desc;
    private int longWay_basePrice;
    private String longWay_desc;
    private int longWay_longWayStart;
    private String nightFee_nightStart;
    private String nightFee_nightEnd;
    private double nightFee_nightIncludeKm;
    private double nightFee_nightStartPrice;
    private int nightFee_nightPrice;
    private int festivalFee_price;
    private String festivalFee_desc;



}

