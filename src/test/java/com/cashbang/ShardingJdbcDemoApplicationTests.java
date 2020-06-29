package com.cashbang;

import com.cashbang.entity.Order;
import com.cashbang.mapper.OrderMapper;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingJdbcDemoApplicationTests {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testInsert(){
        Order order = new Order();
        SnowflakeShardingKeyGenerator generator = new SnowflakeShardingKeyGenerator();
//        System.out.println(Long.valueOf(generator.generateKey().toString()));
        for (int i = 0; i < 200; i++) {
            order.setOrderId(Long.valueOf(generator.generateKey().toString()));
            order.setOrderName("orderName"+i);
            order.setOrderType("type1"+i);
            orderMapper.insertOrder(order);
        }

    }

    @Test
    public void testMod(){
        System.out.println(65%2);
    }
}
