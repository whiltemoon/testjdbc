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
@TableName("ac_balance_chg")
public class BalanceChg implements Serializable {

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
     * 变动类型  1 - 可用余额变动 ，2 - 冻结金额变动 
     */
    private String balanceChgType;

    /**
     * 可用金额	含正负号
     */
    private BigDecimal availBalanceChg;

    /**
     * 冻结的金额	含正负号
     */
    private BigDecimal frozenBalanceChg;

    /**
     * 解冻日 在指定的日期，把冻结的资金变更到可用资金
     */
    private Date unfrozenDate;

    private String postFlag;

    private Integer balChgBusCode;

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

    private String remark;

    private static final long serialVersionUID = 1L;

    private String target;
}