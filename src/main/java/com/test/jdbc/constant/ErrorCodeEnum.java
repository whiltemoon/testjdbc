package com.test.jdbc.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误码类
 * 规则 成功返回 ： 0
 * 异常返回：6位的字符串（1位字母+2位服务（数字）+ 三位具体错误码（数字））
 * A,B,C 开头   A 代表用户端错误，B代表服务端错误，C代表第三方错误
 * 后面跟5位数字， 第二第三位由服务占用， 账户服务默认10， 第4，5，6 具体的错误字符串由数字组成
 * 具体举例： 账户金额不足： A10001
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    OK("0", "success"),
    ACCOUNT_BALANCE_NOT_ENOUGH("A10001", "The language of the content cannot be empty！"),
    ERROR_PARAM("A10002","参数格式错误");

    private String code;
    private String msg;
}
