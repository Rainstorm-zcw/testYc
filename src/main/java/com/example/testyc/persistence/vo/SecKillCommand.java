package com.example.testyc.persistence.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zcw
 * @date 2020-07-31 19:25:23
 * @apiNote
 */
@ApiModel(value = "SecKillCommand", description = "秒杀商品入参")
@Setter
@Getter
public class SecKillCommand {

    @ApiModelProperty(value = "秒杀商品id", required = true)
    private String secKillId;

    @ApiModelProperty(value = "用户id", required = true)
    private String userId;

    @ApiModelProperty(value = "卖家id", required = true)
    private String sellerId;

    @ApiModelProperty(value = "支付金额", required = true)
    private String money;

    @ApiModelProperty(value = "优惠金额", required = true)
    private String saleMoney;
}
