package com.test.jdbc.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 
 */
@Data
@TableName("ac_balance")
public class Balance implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号ID
     */
    private String accountNo;

    /**
     * 币种
     */
    private String ccy;

    /**
     * 展示的精度位数
     */
    private Integer displayPrecision;

    /**
     * 总资产
     */
    private BigDecimal totalAsset;

    /**
     * 可用余额
     */
    private BigDecimal availBalance;

    /**
     * 冻结的余额
     */
    private BigDecimal frozenBalance;

    /**
     * 乐观锁字段
     */
    @Version
    private Integer lockVersion;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 最小转账金额
     */
    private BigDecimal minBalance;

    private static final long serialVersionUID = 1L;
}