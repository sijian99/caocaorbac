package com.caocaorbac.vo;

import lombok.Data;

//用户投诉, 用户投诉司机
@Data
public class ComplaintOrderVO {
    private String client_id;
    private long timestamp;
    private String sign;
    private String order_id;
    private String content;
}
