package com.test.jdbc.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
@Data
@TableName("ac_account")
public class Account implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号ID
     */
    private String accountNo;

    /**
     * 账号名称
     */
    private String accountName;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 账户类型    1 - 积分账户
     */
    private String accountType;

    /**
     * 账户的状态 1 - 正常，2注销，3-冻结
     */
    private String accountStatus;

    /**
     * 开户时间
     */
    private Date openDate;

    /**
     * 销户时间
     */
    private Date cancelDate;

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

    private static final long serialVersionUID = 1L;
}