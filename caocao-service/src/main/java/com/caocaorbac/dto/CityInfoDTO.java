package com.caocaorbac.dto;

import lombok.Data;


@Data
public class CityInfoDTO {
    //城市名称，例如 杭州
    private String cityName;
    //城市code，例如 0571
    private String cityCode;
    //新能源车型，0 为未开通，1 为已开通
    private boolean newEnergy;
    //出租车，0 为未开通，1 为已开通
    private boolean taxi;
    //舒适型，0 为未开通，1 为已开通
    private boolean comfortable;
    //豪华车型，0 为未开通，1 为已开通
    private boolean luxurious;
    //商务车型，0 为未开通，1 为已开通
    private boolean commercial;
    //优选车型，0 为未开通，1 为已开通（服务价格介于新能源和舒适车型之间）
    private boolean choiceness;
    //经济商务，0 为未开通，1 为已开通
    private boolean economic_business;
}
