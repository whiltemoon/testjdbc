package com.test.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.jdbc.entity.Balance;
import org.apache.ibatis.annotations.Mapper;

/**
 * AcBalanceDAO继承基类
 */
@Mapper
public interface BalanceMapper extends BaseMapper<Balance> {

}