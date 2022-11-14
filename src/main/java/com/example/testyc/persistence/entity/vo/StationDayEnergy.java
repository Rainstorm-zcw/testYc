package com.example.testyc.persistence.entity.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class StationDayEnergy {

    /**
     * 电站id
     */
    private Long id;

    /**
     * 发电量
     */
    private BigDecimal energy;

    /**
     * 发电量单位
     */
    private String energyStr;

    /**
     * 时间戳
     */
    private Long date;

    /**
     * 收益
     */
    private BigDecimal money;

    /**
     * 收益单位
     */
    private String moneyStr;

    /**
     * 电池放电电量
     */
    private BigDecimal batteryDischargeEnergy;

    /**
     * 电池充电电量
     */
    private BigDecimal batteryChargeEnergy;

    /**
     * 电表买电
     */
    private BigDecimal gridPurchasedEnergy;

    /**
     * 电表卖电
     */
    private BigDecimal gridSellEnergy;
}
