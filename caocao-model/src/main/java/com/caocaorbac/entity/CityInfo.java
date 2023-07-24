package com.caocaorbac.entity;

import lombok.Data;

import java.time.LocalDateTime;

// 储存城市服务开通状态
@Data
public class CityInfo {
    private String cityName;
    private String cityCode;
    private boolean newEnergy;
    private boolean taxi;
    private boolean comfortable;
    private boolean luxurious;
    private boolean commercial;
    private boolean choiceness;
    private boolean economic_business;
    private String create_by;
    private LocalDateTime create_time;
    private String update_by;
    private LocalDateTime update_time;
    private boolean delete;
}
