package com.example.testyc.persistence.entity.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CollectorDetail {

    /**
     * 采集器id
     */
    private Long id;

    /**
     * 采集器sn
     */
    private String sn;

    /**
     * 电站id
     */
    private Long stationId;

    /**
     * 电站名称
     */
    private String stationName;

    /**
     * 电站地址
     */
    private String addr;
}
