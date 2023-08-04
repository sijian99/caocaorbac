package com.caocaorbac.common.vo;

import lombok.Data;
//批量查询订单的实际支付的本金与赠额具体数额
@Data
public class BatchQueryFeeDetailVO {
    private String client_id;
    private long timestamp;
    private String sign;
    //订单id列表，用‘,’分隔
    private String order_ids;
}
