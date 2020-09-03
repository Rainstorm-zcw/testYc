package com.example.testyc.persistence.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 统一需要状态码支持的返回信息
 * @author: zcw
 * @date: 2020-01-09
 **/
@Data
public final class CommResultAo<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 返回状态码：大于0成功，小于等于0失败
     */
    private int statusCode;

    /**
     * 返回处理消息
     */
    private String message;

    /**
     * 返回请求随机唯一ID
     */
    private String requestUuid;

    /**
     * 具体返回业务数据
     */
    private T data;


    /**
     * 快捷判断（iz开头避免重复序列化）
     */

    //验证成功
    public boolean izSuccess() {
        return this.getStatusCode() > 0;
    }


    /**
     * 快捷返回定义
     */

    public static CommResultAo success(String message) {
        return build(StatusCodeEnum.SUCCESS.getStatusCode(), message, null);
    }

    public static <T> CommResultAo success(String message, T data) {
        return build(StatusCodeEnum.SUCCESS.getStatusCode(), message, data);
    }

    public static CommResultAo fail(String message) {
        return build(StatusCodeEnum.FAIL.getStatusCode(), message, null);
    }

    public static <T> CommResultAo fail(String message, T data) {
        return build(StatusCodeEnum.FAIL.getStatusCode(), message, data);
    }

    public static CommResultAo build(CommResultAo commResultAo) {
        return build(commResultAo.getStatusCode(), commResultAo.getMessage(), null);
    }

    public static <T> CommResultAo build(CommResultAo commResultAo, T data) {
        return build(commResultAo.getStatusCode(), commResultAo.getMessage(), data);
    }

    public static CommResultAo build(StatusCodeEnum statusCodeEnum) {
        return build(statusCodeEnum.getStatusCode(), statusCodeEnum.getMessage(), null);
    }

    public static <T> CommResultAo build(StatusCodeEnum statusCodeEnum, T data) {
        return build(statusCodeEnum.getStatusCode(), statusCodeEnum.getMessage(), data);
    }

    public static CommResultAo build(int statusCode, String message) {
        return build(statusCode, message, null);
    }

    public static <T> CommResultAo build(int statusCode, String message, T data) {
        CommResultAo result = new CommResultAo<T>();
        result.setStatusCode(statusCode);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

}
