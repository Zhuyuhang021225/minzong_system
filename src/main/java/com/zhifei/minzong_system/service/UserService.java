package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.User;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月19日 11:38
 */
public interface UserService extends IService<User> {

    User loginByUserLoginNameAndPassword(String name, String password);
}
