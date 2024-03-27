package com.zhifei.minzong_system.controller;

import com.zhifei.minzong_system.controller.vo.LoginVO;
import com.zhifei.minzong_system.entity.User;
import com.zhifei.minzong_system.service.impl.UserServiceImpl;
import com.zhifei.minzong_system.utils.JWTUtil;
import com.zhifei.minzong_system.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月21日 11:06
 */
@RestController
@RequestMapping
@Api(tags = { "通用访问接口" })
public class CommonController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/login")
    @ApiOperation(value = "登录接口")
    @Transactional
    public Result<LoginVO> loginByLoginNameAndPassword(String loginName, String password){
        if (!Strings.isNotEmpty(loginName)){
            return Result.error("用户名为空！");
        }
        if (!Strings.isNotEmpty(password)){
            return Result.error("密码为空！");
        }

        User user = userService.loginByUserLoginNameAndPassword(loginName, password);
        if (user == null){
            return Result.error("账号或密码错误！");
        }

        LoginVO loginVO = new LoginVO();
        loginVO.setUserName(user.getLoginName());
        String token = JWTUtil.getToken(user);
        loginVO.setToken(token);

        return Result.success(loginVO);
    }
}
