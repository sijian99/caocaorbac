package com.caocaorbac.common.vo;

import lombok.Data;

import java.time.LocalDateTime;

//城市服务开通状态,一次性获取全量的服务城市列表
@Data
public class GetAllCitiesVO {
    private String client_id;
    private LocalDateTime timestamp;
    private String sign;
}
