package com.example.testyc.support.command;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * @author zcw
 * @date 2019-10-19
 * @apiNote 请求公共参数
 */
@Data
@ApiModel(value = "RequestCommand", description = "请求公共参数")
public class RequestCommand {

    @ApiModelProperty(value = "接口名称", required = true)
    private String interfaceName;

    @ApiModelProperty(value = "方法名称", required = true)
    private String methodName;

    @ApiModelProperty(value = "服务id", required = true)
    private String serviceId;

    @ApiModelProperty(value = "服务组")
    private String serviceGroup;

    @ApiModelProperty(value = "服务版本号")
    private String version;

    @ApiModelProperty(value = "请求参数")
    private Map[] methodParams;

}
