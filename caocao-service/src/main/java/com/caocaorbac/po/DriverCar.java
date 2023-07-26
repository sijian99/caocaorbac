package com.caocaorbac.po;

//储存司机和司机驾驶车辆的基本信息
public class DriverCar {

    private long driver_id;
    private String avatar;
    private String carBrand;
    //车辆型号（例如：S90L）
    private String carType;
    //车牌号
    private String card;
    private String color;
    private String level;
    //司机姓名
    private String name;
    //司机接单数
    private String orderCnt;
    //司机手机号（开启虚拟号服务时，为司机-叫车人之间的虚拟号）
    private String phone;
    //司机手机号（开启虚拟号服务时，为司机-乘车人之间的虚拟号，非代他人叫车场景，号码同上phone）
    private String phone_passenger;

}
