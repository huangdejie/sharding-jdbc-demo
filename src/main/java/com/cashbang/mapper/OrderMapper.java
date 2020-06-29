package com.cashbang.mapper;

import com.cashbang.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: huangdj
 * @Date: 2020/6/29
 */
@Mapper
public interface OrderMapper {

    void insertOrder(Order order);

}
