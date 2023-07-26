package com.caocaorbac.po;

import com.caocaorbac.dto.CityInfoDTO;
import lombok.Data;

import java.time.LocalDateTime;

// 储存城市服务开通状态
@Data
public class CityInfo extends CityInfoDTO {
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
