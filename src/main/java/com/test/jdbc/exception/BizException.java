package com.test.jdbc.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 自定义业务异常类
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BizException extends RuntimeException {


    private String code;

    private String msg;


    private BizException(String code) {
        this.code = code;
    }

    /**
     * @param message 错误信息
     * @return BizException
     */
    public static BizException buildWithMsg(String message) {
        return new BizException(null, message);
    }

    /**
     * @param code 错误码
     * @return BizException
     */
    public static BizException build(String code) {
        return new BizException(code);
    }

    /**
     * @param code 错误码
     * @param msg  描述
     * @return BizException
     */
    public static BizException build(String code, String msg) {
        return new BizException(code, msg);
    }
}
