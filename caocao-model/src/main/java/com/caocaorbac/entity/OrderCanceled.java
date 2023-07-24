package com.caocaorbac.entity;

import lombok.Data;

import java.time.LocalDateTime;

//储存被取消的订单信息（取消原因，取消发起方，取消时间等）
@Data
public class OrderCanceled {
    private String order_id;
    private String client_id;
    private String cancel_code;
    private String cancel_reason;
    private String who_cancel;
    private String create_by;
    private LocalDateTime create_time;
    private String update_by;
    private LocalDateTime update_time;
    private boolean delete;
}
