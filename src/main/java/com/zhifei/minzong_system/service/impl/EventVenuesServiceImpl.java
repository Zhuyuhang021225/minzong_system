package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.StatuteInterpretation;
import com.zhifei.minzong_system.entity.religionWorkDataBase.EventVenues;
import com.zhifei.minzong_system.mapper.EventVenuesMapper;
import com.zhifei.minzong_system.mapper.StatuteInterpretationMapper;
import com.zhifei.minzong_system.service.EventVenuesService;
import com.zhifei.minzong_system.service.StatuteInterpretationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class EventVenuesServiceImpl extends ServiceImpl<EventVenuesMapper, EventVenues> implements EventVenuesService {

    @Autowired
    private EventVenuesMapper eventVenuesMapper;

    @Override
    public Page<EventVenues> getAllEventVenuesPage(Integer current, Integer pageSize) {
        Page<EventVenues> eventVenuesPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<EventVenues> eventVenuesLambdaQueryWrapper = new LambdaQueryWrapper<>();

        eventVenuesMapper.selectPage(eventVenuesPage, eventVenuesLambdaQueryWrapper);

        return eventVenuesPage;
    }
}
