package com.cashbang.entity;

/**
 * @Author: huangdj
 * @Date: 2020/6/29
 */
public class Order {

    private Long orderId;

    private String orderName;

    private String orderType;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
