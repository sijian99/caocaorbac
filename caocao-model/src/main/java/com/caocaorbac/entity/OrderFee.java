package com.caocaorbac.entity;

import lombok.Data;

import java.util.List;

//订单支付金额= companyFee + donate + companyFeeChange + donateChange

//储存所有订单的账单信息
@Data
public class OrderFee {
    private String order_id;
    private long totalFee;
    /*个人支付（比如乘客现金支付，现金支付不会扣除企业余额*/
    private long personalPayAmount;
    /*企业支付的总金额*/
    private long companyPayAmount;
    /*订单折前原价金额 （值=折后金额+优惠金额）*/
    private long originTotalFee;
    /*当预估路线存在高速路段时：0 代表高速费正常收取*/
    private int  doubleTollFlag;
    /*明细金额*/
    private List<String> detailFeeVos;

    /*本金支付*/
    private long principalAmount;
    /*赠额支付*/
    private long giftAmount;
    /*企业支付可开票金额*/
    private long companyAmount;
    /*个人支付可开票金额*/
    private long personalAmount;



}
