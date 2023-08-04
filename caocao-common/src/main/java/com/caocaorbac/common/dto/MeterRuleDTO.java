package com.caocaorbac.common.dto;

import lombok.Data;

//计价规则查询
@Data
public class MeterRuleDTO {
    /* 服务车型code */
    private int carTypeCode;
    /* 车型描述，例如“新能源” */
    private String carTypeDesc;
    /* 起步价格，单位分 */
    private int startPrice_basePrice;
    /* 描述，起步价 */
    private String startPrice_desc;
    /* 起步公里数 */
    private double startPrice_startIncludeKm;
    /* 起步分钟数 */
    private int startPrice_startIncludeMinute;
    /* 基础里程价格，单位分*/
    private int kmPrice_basePrice;
    /* 里程费描述 */
    private String kmPrice_desc;
    /* 时长费价格 */
    private int timePrice_basePrice;
    /* 时长费描述 */
    private String timePrice_desc;
    /* 长途费价格 */
    private int longWay_basePrice;
    /*长途费描述 */
    private String longWay_desc;
    /* 长途计费起点,单位:km*/
    private int longWay_longWayStart;
    /* 夜间起始时间 "HH:mm:ss */
    private String nightFee_nightStart;
    /* 夜间终止时间 "HH:mm:ss" */
    private String nightFee_nightEnd;
    /* 起步公里数 */
    private double nightFee_nightIncludeKm;
    /* 夜间起步费，单位分*/
    private double nightFee_nightStartPrice;
    /* 夜间每公里价格，单位分 */
    private int nightFee_nightPrice;
    /* 节日服务费 */
    private int festivalFee_price;
    /*节日服务费描述 */
    private String festivalFee_desc;
}
