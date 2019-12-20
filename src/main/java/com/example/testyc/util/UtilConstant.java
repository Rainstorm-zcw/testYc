package com.example.testyc.util;

import org.springframework.stereotype.Component;

import java.nio.charset.Charset;

/**
 * @author zcw
 * @date 2018-10-01
 * @description 工具常量类
 */
@Component
public class UtilConstant {
    public static final Charset DEFAULT_CHARSET_UTF8 = Charset.forName("UTF-8");

    /**
     * 20181001
     */
    public static String YYYYMMDD = "yyyyMMdd";

    /**
     * 2018-10-01
     */
    public static String YYYY_MM_DD = "yyyy-MM-dd";

    /**
     * 2018-10-01 10:10:10
     */
    public static final String YYYY_MM_DDHHMMSS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 20181001 101010
     */
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    /**
     * 当前时间戳
     */
    public static String TIMESTAMP = String.valueOf(System.currentTimeMillis());

}
