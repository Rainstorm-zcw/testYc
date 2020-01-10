package com.example.testyc.persistence.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 账号检查常量定义
 * @author: zcw
 * @date: 2019年11月27日 10:15
 **/
public final class AccountCheckConstants {
    private AccountCheckConstants() {}

    /**
     * @description: 手机号验证场景类型
     * @author: zcw
     * @date: 2019年10月15日 13:23
     **/
    @Getter
    @AllArgsConstructor
    public enum MobileCheckTypeEnum implements EnumCodeApi {
        LOGIN("LOGIN","登录校验"),
        REGISTER("REGISTER","注册校验");

        private String code;
        private String desc;

    }

    /**
     * @description: 手机号验证场景类型
     * @author: zcw
     * @date: 2019年10月15日 13:23
     **/
    @Getter
    @AllArgsConstructor
    public enum CompanyNameCheckTypeEnum implements EnumCodeApi {
        REGISTER("REGISTER","注册校验");

        private String code;
        private String desc;

    }

    /**
     * @description: 个人加入公司动作类型枚举
     * @author: zcw
     * @date: 2019年10月15日 13:23
     **/
    @Getter
    @AllArgsConstructor
    public enum BindCompanyActionTypeEnum implements EnumCodeApi {
        CREATE_COMPANY("CREATE_COMPANY","创建公司"),
        GRANT_CERT_ACCOUNT("GRANT_CERT_ACCOUNT","授权书创建公司"),
        GRANT_DIRECT_ACCOUNT("GRANT_DIRECT_ACCOUNT","授权直接创建公司"),
        JOIN_APPLY("JOIN_APPLY","申请加入公司"),
        AUTH_IDENTITY("AUTH_IDENTITY","认证公司"),
        NO_ACTION("NO_ACTION","无动作");

        private String code;
        private String desc;

    }

}
