package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.OnlineReviewer;
import com.zhifei.minzong_system.entity.StatuteInterpretation;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:13
 */

public interface OnlineReviewerService extends IService<OnlineReviewer> {

    Page<OnlineReviewer> getAllOnlineReviewerPage(Integer current, Integer pageSize);
}
