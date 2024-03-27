package com.zhifei.minzong_system.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月21日 11:12
 */
@ApiModel("用户登录后的返回对象")
@Data
public class LoginVO {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户登录状态")
    private String token;
}
