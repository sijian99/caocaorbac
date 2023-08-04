package com.caocaorbac.common.dto;

import java.util.List;

public class OrderDetailDTO {
    //开始服务时间
    private String startServiceTime;
    //开始计费时间
    private String beginChargeTime;
    //用车时间
    private String departureTime;
    //下单人手机号
    private String callerPhone;
    //下单城市code
    private String cityCode;
    //出发地详细地址
    private String startAddress;
    //实际上车地详细地址
    private String realStartAddress;
    //出发地区域
    private String startName;
    //	目的地详细地址
    private String endAddress;
    // 实际下车地详细地址
    private String realEndAddress;
    //目的地区域
    private String endName;
    //预估金额，单位分
    private String estimatePrice;
    //外部业务的订单ID，原样记录透传
    private String extOrderId;
    //拓展信息，调用下单接口时传入原样记录透传
    private String extraInfo;
    //订单完成时间（司机点击结算的时间
    private String finishTime;
    //订单支付成功时间
    private String payTime;
    //订单取消时间
    private String canceledTime;
    //航班号
    private String flightNumber;
    //出发地经度
    private String fromLocation_lng;
    //出发地纬度
    private String fromLocation_lat;
    //实际出发地经度
    private String realStartLocation_longitude;
    //实际出发地纬度
    private String realStartLocation_latitude;
    //实际的行驶路程，只有当订单完结的时候才会有值，单位千米
    private String normalDistance;
    //实际的行驶时间，只有当订单完结的时候才会有值，单位分
    private String normalTime;
    //	订单号
    private String orderId;
    //下单地纬度
    private String orderLocation_lat;
    //下单地经度
    private String orderLocation_lng;
    //下单时间
    private String orderTime;
    //	乘车人姓名
    private String passengerName;
    // 乘车人手机号
    private String passengerPhone;
    //订单车型：2 新能源；3 舒适型；5 商务型；7 优选 ；
    private String requireLevel;
    //订单状态，请参照1.5 状态码
    private String status;
    //司机接单时间
    private String striveTime;
    //是否开票
    private String invoiced;
    //开票状态 0: 未开票1: 已开票 2: 已寄出
    private String invoiceStatus;
    //目的地经度
    private String toLocation_lng;
    //目的地纬度
    private String toLocation_lat;
    //实际结束地经度
    private String realEndLocation_longitude;
    //实际结束地纬度
    private String realEndLocation_latitude;
    //订单类型，请参照《1.5 订单状态及类型》
    private String type;
    //长途里程
    private String longKm;
    //夜间行驶里程
    private String nightKm;
    //夜间行驶时间，单位分钟
    private String nightTime;
    //行程总里程
    private String travelKm;
    //司机到达上车点时间
    private String arrivedTime;
    //订单个人支付部分使用支付方式：2 支付宝；3 现金；5 微信；8 个人余额；0 无
    private String personalPayMethod;
    //	是否尊享一口价
    private String isSpecialFixedPrice;
    //是否路线一口价
    private String isRouteFixedPrice;
    //公司ID
    private String companyNo;
    //订单来源：1 OPEN-API；2 个人H5；3 企业H5；4 邀约券H5；5 绿色公务APP；6 曹操出行APP；7 企业管理后台；8 客服下单；0 其他；
    private String origin;
    //下单备注字段，状态通知原样透传
    private String callbackInfo;
    //用车H5传入的第三方用户ID
    private String accid;
    //下单时是否允许加盟司机服务
    private String acceptCPDriver;
    //是否是加盟司机服务， true：加盟运力， false：自营运力
    private boolean cpDriver;
    //是否接力单，true：接力单， false：非接力单
    private boolean isRelayOrder;
    //接力单状态，上一单订单结束状态，true：接力单前单结束，false：接力单前单司机服务中
    private boolean preOrderEndFlag;
    //接力单上一单终点经度
    private String preOrderEndLocation_longitude;
    //接力单上一单终点纬度
    private String preOrderEndLocation_latitude;
    //是否允许拼车：0 不拼车；1 允许拼车
    private String carpoolType;
    //拼车单乘车人数，允许拼车订单单才有该字段
    private String countPerson;
    //是否拼成：true 拼成；false 未拼成，默认为false
    private String carpoolFlag;
    //拼车订单号，允许拼车订单才有该字段
    private String carpoolOrderNo;
    //拼车单途经点（子订单）信息，允许拼车订单才有该字段
    private String wayPointInfoList;
    //子订单号
    private String wayPointInfoList_orderNo;
    //子订单起点经度
    private String wayPointInfoList_startLng;
    //子订单起点纬度
    private String wayPointInfoList_startLat;
    //子订单终点经度
    private String wayPointInfoList_endLng;
    //子订单终点纬度
    private String wayPointInfoList_endLat;
    //子订单乘车人数
    private String wayPointInfoList_countPerson;
    //子订单状态，请参照1.5 状态码
    private String wayPointInfoList_status;
    //是否敏感订单，true:是；false:否
    private boolean sensitiveOrder;
    //风险订单类型：命中的敏感项和敏感详细描述
    private List<String> sensitiveOrderRuleList;
    //员工填写的敏感订单备注
    private String sensitiveOrderUserReason;
    //	用车规则ID
    private String ruleId;
    //用车场景名称
    private String situationName;
    //用车备注，公司管理员查看
    private String companyReason;
    //司机编号
    private String driverInfoVo_id;
    //司机头像地址
    private String driverInfoVo_avatar;
    //车辆品牌（例如：吉利
    private String driverInfoVo_carBrand;
    //车辆型号（例如：S90L）
    private String driverInfoVo_carType;
    //车牌号
    private String driverInfoVo_card;
    //车辆颜色，例如 白色
    private String driverInfoVo_color;
    //司机服务评分，最高为5.0
    private String driverInfoVo_level;
    //司机姓名
    private String driverInfoVo_name;
    //	司机接单数
    private String driverInfoVo_orderCnt;
    //司机手机号（开启虚拟号服务时，为司机-叫车人之间的虚拟号）
    private String driverInfoVo_phone;
    //司机手机号（开启虚拟号服务时，为司机-乘车人之间的虚拟号，非代他人叫车场景，号码同上phone）
    private String driverInfoVo_phone_passenger;
    //实际服务类型
    private String driverInfoVo_serviceType;
    //	司机位置纬度
    private List<String> driverInfoVo_location_lat;
    //司机位置经度
    private String driverInfoVo_location_lng;
    //订单金额(折后金额)，单位分
    private String orderFeeVo_totalFee;
    //个人支付（比如乘客现金支付，现金支付不会扣除企业余额），单位分
    private String orderFeeVo_personalPayAmount;
    //企业支付的总金额（会包含改价后的总额，值=改价前支付金额+改价后补扣和退款的金额），单位分 只有企业支付后才会有值
    private String orderFeeVo_companyPayAmount;
    //订单折前原价金额（值=折后金额+优惠金额），单位分，如订单无实际行程无值则不返回该字段
    private String orderFeeVo_originTotalFee;
    //当预估路线存在高速路段时：0 代表高速费正常收取。其中一口价类型订单高速费直接计入一口价内，普通类型价订单不计入预估价，仅做提示
    private String orderFeeVo_doubleTollFlag;
    //明细金额，单位分
    private String orderFeeVo_detailFeeVos_amount;
    //明细编码(产生费用，费用项才会漏出) start_fee：订单起步价；travel_km_fee：里程费用；travel_minute_fee：时长费用；long_km_fee：长途费；
    // long_km2_fee：超远长途费；night_fix, 夜间起步费用;night_fee：夜间行驶超长费用；
    // lowest_cost_fee：基础费用补充额（预约单基础费30元，例如一笔预约单初始预估18元，则基础费用补充额为12元）；discount_fee：折扣金额；
    // park_fee：停车费用；bridge_fee：路桥费；other_fee：其他费用；refund_fee：退款金额（客服改价改低/免单产生的退款金额）；hight_speed_fee：高速费 ; mend_deduct_fee: 补扣费用（客服改价改高产生的补扣金额）；
    // festival_fee:节假日服务费; cancel_fee: 取消补偿费用
    private String orderFeeVo_detailFeeVos_chargeCode;
    //明细描述
    private String orderFeeVo_detailFeeVos_chargeDesc;
    //本金支付
    private String orderPayVo_principalAmount;
    //赠额支付
    private String orderPayVo_giftAmount;
    //企业支付可开票金额
    private String orderInvoiceVo_companyAmount;
    //个人支付可开票金额
    private String orderInvoiceVo_personalAmount;
}
