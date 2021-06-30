package com.test.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.jdbc.entity.BalanceChg;
import org.apache.ibatis.annotations.Mapper;

/**
 * AcBalanceChgDAO继承基类
 */
@Mapper
public interface BalanceChgMapper extends BaseMapper<BalanceChg> {
}