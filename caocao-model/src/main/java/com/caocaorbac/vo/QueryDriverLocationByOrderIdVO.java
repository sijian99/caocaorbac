package com.caocaorbac.vo;

import lombok.Data;

//司机位置查询
@Data
public class QueryDriverLocationByOrderIdVO {
    private String client_id;
    private long timestamp;
    private String sign;
    private int order_id;
}
