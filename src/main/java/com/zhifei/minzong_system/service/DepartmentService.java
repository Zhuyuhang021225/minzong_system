package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Department;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月22日 09:55
 */
public interface DepartmentService extends IService<Department> {

    Page<Department> getAllDepartmentPage(Integer current, Integer pageSize);

    Page<Department> getDepartmentByArea(String area, Integer current, Integer pageSize);

    Page<Department> getDepartmentByLevel(String level, Integer current, Integer pageSize);

    Page<Department> getDepartmentByQuality(String quality, Integer current, Integer pageSize);

    Page<Department> getDepartmentByLeader(String leader, Integer current, Integer pageSize);
}
