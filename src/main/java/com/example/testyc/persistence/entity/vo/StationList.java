package com.example.testyc.persistence.entity.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 锦浪云电站列表
 */
@Setter
@Getter
public class StationList {

    /**
     * 电站id
     */
    private Long id;

    /**
     * 电站名称
     */
    private String stationName;

    /**
     * 电站地址
     */
    private String addr;

    /**
     * 业主id
     */
    private String userId;

    /**
     * 业主名称
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 装机容量
     */
    private String capacity;

    /**
     * 装机容量单位
     */
    private String capacityStr;

    /**
     * 当日能量
     */
    private String dayEnergy;

    /**
     * 当日能量单位
     */
    private String dayEnergyStr;

    /**
     * 总能量
     */
    private String allEnergy;

    /**
     * 总能量单位
     */
    private String allEnergyStr;

    /**
     * 满发小时数
     */
    private String fullHour;

    /**
     * 图片
     */
    private String picName;

    /**
     * 功率
     */
    private String power;

    /**
     * 功率单位
     */
    private String powerStr;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 经丢
     */
    private String longitude;

    /**
     * 主子账号id
     */
    private Long installerId;

    /**
     * 主子账号
     */
    private String installer;

    /**
     * 电站状态  1在线；2离线；3报警
     */
    private String state;

    /**
     * 时间戳
     */
    private String dataTimestamp;

    /**
     * 国家
     */
    private String countryStr;

    /**
     * 省份
     */
    private String regionStr;

    /**
     * 城市
     */
    private String cityStr;
}
