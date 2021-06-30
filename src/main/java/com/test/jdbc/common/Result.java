package com.test.jdbc.common;



import com.test.jdbc.constant.ErrorCodeEnum;

import java.io.Serializable;

/**
 * 通用返回值类
 */
public class Result<T> implements Serializable {

    /**
     * 返回码
     */
    private String code;

    /**
     * 说明
     */
    private String msg;

    /**
     * 返回实体对象
     */
    private T data;


    public Result(String code){
        this.code = code;
    }


    /**
     * 成功构造
     *
     * @param data T
     * @return Result<T>
     */
    public static <T> Result success(T data) {
        return new Result<T>(ErrorCodeEnum.OK.getCode(), ErrorCodeEnum.OK.getMsg(), data);
    }

    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
