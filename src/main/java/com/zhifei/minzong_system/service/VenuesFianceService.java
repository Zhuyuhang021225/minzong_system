package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.religionWorkDataBase.EventVenues;
import com.zhifei.minzong_system.entity.religionWorkDataBase.VenuesFiance;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:13
 */

public interface VenuesFianceService extends IService<VenuesFiance> {

    Page<VenuesFiance> getAllVenuesFiancePage(Integer current, Integer pageSize);
}
