package com.zhifei.minzong_system.controller;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.zhifei.minzong_system.entity.User;
import com.zhifei.minzong_system.service.impl.UserServiceImpl;
import com.zhifei.minzong_system.utils.JWTUtil;
import com.zhifei.minzong_system.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月19日 11:38
 */

@RestController
@RequestMapping("/users")
@Api(tags = {"用户信息访问接口"})
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "通过token换取用户信息")
    @GetMapping()
    @Transactional
    public Result<User> getUserInformation(@RequestHeader("Authorization") @ApiParam("用户token") String token){
        if (!Strings.isNotEmpty(token)){
            return Result.error("获取用户信息参数错误！");
        }

        DecodedJWT decode = JWTUtil.decode(token);
        Integer id = decode.getClaim("id").asInt();

        User loginUser = userService.getById(id);

        if (loginUser == null){
            return Result.error("获取用户信息错误，稍后再试");
        }

        return Result.success(loginUser);
    }
}
