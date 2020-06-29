package com.cashbang.entity;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: huangdj
 * @Date: 2020/6/29
 */
@Mapper
public class OrderItem {

    private Long itemId;

    private Long orderId;

    private String itemDetail;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail;
    }
}
