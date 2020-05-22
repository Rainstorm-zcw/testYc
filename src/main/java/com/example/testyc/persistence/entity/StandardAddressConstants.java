package com.example.testyc.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * @author zcw
 * @date 2020-04-20
 * @description 标准五级地址枚举
 */
public class StandardAddressConstants {

    @Getter
    @AllArgsConstructor
    public enum SiteType {
        CK("仓库", "1"),
        JG("加工", "2"),
        MT("码头", "3"),
        TLZX("铁路专线", "4"),
        JHD("交货地", "JHD"),
        SHD("收货地", "SHD"),
        BW("泊位","7"),
        TL("铁路", "6");


        private String name;
        private String value;

        /**
         * 根据名称获取value
         *
         * @param name 名称
         * @return 返回value
         */
        public static SiteType getValue(String name) {
            if (StringUtils.isBlank(name)) {
                return null;
            }
            for (StandardAddressConstants.SiteType siteType : values()) {
                if (siteType.getName().equals(name.trim())) {
                    return siteType;
                }
            }
            for (StandardAddressConstants.SiteType siteType : values()) {
                if (siteType.getValue().equals(name.trim())) {
                    return siteType;
                }
            }
            return  null;
        }
    }



}
