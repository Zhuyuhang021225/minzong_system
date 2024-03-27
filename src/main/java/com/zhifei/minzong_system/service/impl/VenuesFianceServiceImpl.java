package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.religionWorkDataBase.EventVenues;
import com.zhifei.minzong_system.entity.religionWorkDataBase.VenuesFiance;
import com.zhifei.minzong_system.mapper.EventVenuesMapper;
import com.zhifei.minzong_system.mapper.VenuesFianceMapper;
import com.zhifei.minzong_system.service.EventVenuesService;
import com.zhifei.minzong_system.service.VenuesFianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class VenuesFianceServiceImpl extends ServiceImpl<VenuesFianceMapper, VenuesFiance> implements VenuesFianceService {

    @Autowired
    private VenuesFianceMapper venuesFianceMapper;

    @Override
    public Page<VenuesFiance> getAllVenuesFiancePage(Integer current, Integer pageSize) {
        Page<VenuesFiance> venuesFiancePage = new Page<>(current, pageSize);
        LambdaQueryWrapper<VenuesFiance> venuesFianceLambdaQueryWrapper = new LambdaQueryWrapper<>();

        venuesFianceMapper.selectPage(venuesFiancePage, venuesFianceLambdaQueryWrapper);

        return venuesFiancePage;
    }
}
