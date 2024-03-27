package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.User;
import com.zhifei.minzong_system.mapper.UserMapper;
import com.zhifei.minzong_system.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月19日 11:39
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginByUserLoginNameAndPassword(String loginName, String password) {

        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
        userLambdaQueryWrapper.eq(Strings.isNotEmpty(loginName), User::getLoginName, loginName);
        userLambdaQueryWrapper.eq(Strings.isNotEmpty(password), User::getPassword, password);

        return userMapper.selectOne(userLambdaQueryWrapper);
    }
}
