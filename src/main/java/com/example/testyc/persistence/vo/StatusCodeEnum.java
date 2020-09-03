package com.example.testyc.persistence.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 系统状态码枚举
 * @author: zcw
 * @date: 2019年10月15日 13:23
 **/
@Getter
@AllArgsConstructor
public enum StatusCodeEnum {
    //====================  会员系统状态码10+XXX ====================
    //== QQ登录相关
    //== 微信登录相关
    //== 扫码登录相关
    //== TOKEN用户登录相关
    TICKET_ACCOUNT_NOT_EXIST(-10142,"票据用户不存在"),
    TICKET_NAME_PWD_ERROR(-10141,"票据用户对接口令错误"),
    TICKET_NAME_EXPIRED(-10140,"票据用户过期或失效"),
    //== 重验登录相关
    DBLCHK_PWD_BIND_ACCOUNT_ERROR(-10132,"重验登录绑定用户错误"),
    DBLCHK_PWD_TICKET_ERROR(-10131,"重验登录信息错误"),
    DBLCHK_PWD_TICKET_EXPIRED(-10130,"重验登录信息过期或失效"),
    //== 手机登录相关
    MOBILE_AUTO_REGISTER_FAIL(-10129,"手机号自动注册失败"),
    MOBILE_CHECK_FREQUENT(-10128,"手机码验证过于频繁"),
    MOBILE_NOBIND_CODE(-10127,"手机号绑定验证失败"),
    MOBILE_MULTI_CODE(-10126,"手机号绑定多账号"),
    MOBILE_CODE_EXPIRED(-10125,"手机验证码过期或失效"),
    MOBILE_CODE_ERROR(-10124,"手机验证码错误"),
    MOBILE_CODE_FREQUENT(-10123,"手机验证码请求过于频繁"),
    MOBILE_NOT_REGISTER(-10122,"手机号未注册"),
    MOBILE_RULE_ERROR(-10121,"手机号格式错误"),
    MOBILE_CODE_EMPTY(-10110,"手机号和验证码不能为空"),
    //== 密码登录相关
    PASSWORD_STRENGTH_LOW(-10105,"密码强度太低,请立即修改密码"),
    PASSWORD_ERROR_OVER(-10104,"密码输错次数过多"),
    PASSWORD_ERROR(-10103,"密码错误"),
    ACCOUNT_NOT_EXIST(-10102,"账号不存在"),
    ACCOUNT_EMPTY(-10101,"账号不能为空"),
    ACCOUNT_PWD_EMPTY(-10100,"账号和密码不能为空"),
    //== 会员相关通用错误或内部异常
    LOGIN_SAFE_AUTH(-10025,"待安全身份校验"),
    ACCOUNT_IN_AUDITING(-10024,"账号审核中"),
    ACCOUNT_ACTIVE_INVALID(-10023,"账号被锁定"),//停用
    ACCOUNT_STATUS_LOGOUT(-10022,"账号已注销"),//注销
    ACCOUNT_LOGIN_FORBID(-10020,"账号已注销或停用"),
    DBLCHK_PWD_XX_EXCEPTION(-10011,"重验身份内部服务错误"),
    ACCOUNT_XX_EXCEPTION(-10010,"账号逻辑异常"),//账号异常（程序设计BUG）
    SECRET_DECRYPT_ERROR(-3,"安全解析错误。"),
    ILLEGAL_PARAMETER(-2,"非法参数异常。"),
    NULLP(-1,"内部服务异常。"),
    FAIL(0,"内部服务出错"),
    SUCCESS(1,"服务处理成功"),
    ZZ_SUCCESS(99999,"服务处理成功");//占位符（不使用，方便再SUCCESS后添加正确枚举）

    private Integer statusCode;
    private String message;

    //验证成功
    public boolean izSuccess() {
        return this.getStatusCode() > 0;
    }

}
