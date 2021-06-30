package com.test.jdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.jdbc.entity.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * AccountMapper继承基类
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
