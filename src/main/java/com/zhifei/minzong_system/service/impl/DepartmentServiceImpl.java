package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Department;
import com.zhifei.minzong_system.mapper.DepartmentMapper;
import com.zhifei.minzong_system.service.DepartmentService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月22日 09:56
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Page<Department> getAllDepartmentPage(Integer current, Integer pageSize) {
        Page<Department> departmentPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Department> departmentLambdaQueryWrapper = new LambdaQueryWrapper<>();

        departmentMapper.selectPage(departmentPage, departmentLambdaQueryWrapper);

        return departmentPage;
    }

    @Override
    public Page<Department> getDepartmentByArea(String area, Integer current, Integer pageSize) {
        Page<Department> departmentPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Department> departmentLambdaQueryWrapper = new LambdaQueryWrapper<>();
        departmentLambdaQueryWrapper.eq(Strings.isNotEmpty(area), Department::getArea, area);

        departmentMapper.selectPage(departmentPage, departmentLambdaQueryWrapper);

        return departmentPage;
    }

    @Override
    public Page<Department> getDepartmentByLevel(String level, Integer current, Integer pageSize) {
        Page<Department> departmentPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Department> departmentLambdaQueryWrapper = new LambdaQueryWrapper<>();
        departmentLambdaQueryWrapper.eq(Strings.isNotEmpty(level), Department::getInstitutionLevel, level);

        departmentMapper.selectPage(departmentPage, departmentLambdaQueryWrapper);

        return departmentPage;
    }

    @Override
    public Page<Department> getDepartmentByQuality(String quality, Integer current, Integer pageSize) {
        Page<Department> departmentPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Department> departmentLambdaQueryWrapper = new LambdaQueryWrapper<>();
        departmentLambdaQueryWrapper.eq(Strings.isNotEmpty(quality), Department::getInstitutionQuality, quality);

        departmentMapper.selectPage(departmentPage, departmentLambdaQueryWrapper);

        return departmentPage;
    }

    @Override
    public Page<Department> getDepartmentByLeader(String leader, Integer current, Integer pageSize) {
        Page<Department> departmentPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Department> departmentLambdaQueryWrapper = new LambdaQueryWrapper<>();
        departmentLambdaQueryWrapper.like(Strings.isNotEmpty(leader), Department::getLeader, leader);

        departmentMapper.selectPage(departmentPage, departmentLambdaQueryWrapper);

        return departmentPage;
    }


}
