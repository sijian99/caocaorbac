package com.caocaorbac.common.vo;

import lombok.Data;

//用户评价,用户评价司机
@Data
public class EvaluateOrderVO {
    private String client_id;
    private long timestamp;
    //private String sign;
    private String order_id;
    private int score;
    private String content;
}
