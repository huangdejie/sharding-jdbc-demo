package com.cashbang.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 分库：精确分片算法
 * @Author: huangdj
 * @Date: 2020/6/29
 */
public class DataBasePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {


    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        Long value = preciseShardingValue.getValue();
        for (String s : collection) {
            return s;
        }
        return null;
    }
}
