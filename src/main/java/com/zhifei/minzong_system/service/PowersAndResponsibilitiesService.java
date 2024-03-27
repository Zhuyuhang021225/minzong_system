package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.PowersAndResponsibilities;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:13
 */

public interface PowersAndResponsibilitiesService extends IService<PowersAndResponsibilities> {

    Page<PowersAndResponsibilities> getAllPowersAndResponsibilitiesPage(Integer current, Integer pageSize);
}
