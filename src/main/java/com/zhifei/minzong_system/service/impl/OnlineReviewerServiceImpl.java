package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.OnlineReviewer;
import com.zhifei.minzong_system.mapper.OnlineReviewerMapper;
import com.zhifei.minzong_system.service.OnlineReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class OnlineReviewerServiceImpl extends ServiceImpl<OnlineReviewerMapper, OnlineReviewer> implements OnlineReviewerService {

    @Autowired
    private OnlineReviewerMapper onlineReviewerMapper;

    @Override
    public Page<OnlineReviewer> getAllOnlineReviewerPage(Integer current, Integer pageSize) {
        Page<OnlineReviewer> onlineReviewerPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<OnlineReviewer> onlineReviewerLambdaQueryWrapper = new LambdaQueryWrapper<>();

        onlineReviewerMapper.selectPage(onlineReviewerPage, onlineReviewerLambdaQueryWrapper);

        return onlineReviewerPage;
    }
}
