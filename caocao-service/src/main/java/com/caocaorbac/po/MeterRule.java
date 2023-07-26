package com.caocaorbac.po;

import com.caocaorbac.dto.MeterRuleDTO;
import lombok.Data;

import java.time.LocalDateTime;

//储存所有城市中，不同车型，不同订单类型的收费标准
@Data
public class MeterRule extends MeterRuleDTO {
    /* 城市编码 */
    private String city_code;
    /* 订单类型，请参照《1.5 订单状态及类型》*/
    private int order_type;
    /* 服务车型：2 新能源；3 舒适型；4 豪华型；5 商务型；7 优选*/
    private int car_type;
    //创建人
    private String create_by;
    //创建时间
    private LocalDateTime create_time;
    //更新人
    private String update_by;
    //更新时间
    private LocalDateTime update_time;
    //是否删除，0为未删除，1为已删除
    private boolean delete;




}

