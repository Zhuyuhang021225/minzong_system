package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.religionWorkDataBase.Faculty;
import com.zhifei.minzong_system.entity.religionWorkDataBase.OrganizationData;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:13
 */

public interface FacultyService extends IService<Faculty> {

    Page<Faculty> getAllFacultyPage(Integer current, Integer pageSize);
}
