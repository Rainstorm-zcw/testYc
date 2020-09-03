package com.example.testyc.util;

import com.alibaba.fastjson.JSON;
import com.example.testyc.persistence.vo.AccountCheckConstants;
import com.example.testyc.persistence.vo.CommResultAo;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author zcw
 * @date 2020-01-09
 * @description 秘钥工具类
 */
@Data
public class TokenUtil implements Serializable {
    private static final long serialVersionUID = 1L;

    //秘钥
    private static final String ACTION_PASSWORD = "token-password";

    /**
     * 手机号
     */
    private String phone;

    /**
     * 时间戳
     */
    private long millSecond;

    /**
     * 个人绑定公司动作类型（不为空）
     */
    private AccountCheckConstants.BindCompanyActionTypeEnum at;

    /**
     * 公司名称
     */
    private String companyName;


    /**
     * 当前对象加密
     *
     * @return
     */
    public static String encrypt(TokenUtil data) {
        if (data != null) {
            return AESUtil.encrypt(JSON.toJSONString(data), ACTION_PASSWORD);
        }
        return "";
    }

    /**
     * 解密还原信息
     *
     * @param secretToken
     * @return
     */
    public static TokenUtil decrypt(String secretToken) {
        if (StringUtils.isNotBlank(secretToken)) {
            try {
                String decrypt = AESUtil.decrypt(secretToken, ACTION_PASSWORD);
                return JSON.parseObject(decrypt, TokenUtil.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 验权
     *
     * @param actionType
     * @param secretToken
     * @param phone
     * @param companyName
     * @return
     */
    public CommResultAo<TokenUtil> auditActionSecret(AccountCheckConstants.BindCompanyActionTypeEnum actionType, String secretToken, String phone, String companyName) {
        if (actionType == null || AccountCheckConstants.BindCompanyActionTypeEnum.NO_ACTION.equals(actionType)) {
            return CommResultAo.fail("绑定公司操作类型未指定");
        }
        String actionTitle = actionType.getDesc();
        //验证申请用户信息
        if (StringUtils.isBlank(secretToken)) {
            //外部认证对接必须提供token认证
            if (Arrays.asList(
                    AccountCheckConstants.BindCompanyActionTypeEnum.GRANT_DIRECT_ACCOUNT,
                    AccountCheckConstants.BindCompanyActionTypeEnum.GRANT_CERT_ACCOUNT)
                    .contains(actionType)) {
                return CommResultAo.fail(actionTitle + "令牌未提供");
            } else {
                return CommResultAo.success(actionTitle + "无需验证", new TokenUtil());
            }
        } else {
            TokenUtil secretBo = TokenUtil.decrypt(secretToken);
            if (secretBo == null) {
                return CommResultAo.fail(actionTitle + "令牌解析失败");
            }
            if (!actionType.equals(secretBo.getAt())) {
                return CommResultAo.fail(actionTitle + "令牌类型不匹配！");
            }
            //有效期30分钟
            if ((System.currentTimeMillis() - secretBo.getMillSecond()) > 10 * 1000) {
                return CommResultAo.fail(actionTitle + "令牌过期");
            }
            if (StringUtils.isNotBlank(phone) && !phone.equals(secretBo.getPhone())) {
                return CommResultAo.fail(actionTitle + "手机号验证失败");
            }
            if (StringUtils.isNotBlank(companyName)
                    && !ObjectUtil.halfWidth2fullWidth(companyName).equals(secretBo.getCompanyName())) {
                return CommResultAo.fail(actionTitle + "公司名称验证失败");
            }
            return CommResultAo.success(actionTitle + "验证成功", secretBo);
        }
    }
}
