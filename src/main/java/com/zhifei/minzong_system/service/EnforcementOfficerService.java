package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.EnforcementOfficer;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.StatuteInterpretation;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:13
 */

public interface EnforcementOfficerService extends IService<EnforcementOfficer> {

    Page<EnforcementOfficer> getAllEnforcementOfficerPage(Integer current, Integer pageSize);
}
