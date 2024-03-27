package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.religionWorkDataBase.Faculty;
import com.zhifei.minzong_system.entity.religionWorkDataBase.OrganizationData;
import com.zhifei.minzong_system.mapper.FacultyMapper;
import com.zhifei.minzong_system.mapper.OrganizationDataMapper;
import com.zhifei.minzong_system.service.FacultyService;
import com.zhifei.minzong_system.service.OrganizationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class FacultyServiceImpl extends ServiceImpl<FacultyMapper, Faculty> implements FacultyService {

    @Autowired
    private FacultyMapper facultyMapper;

    @Override
    public Page<Faculty> getAllFacultyPage(Integer current, Integer pageSize) {
        Page<Faculty> facultyPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Faculty> facultyLambdaQueryWrapper = new LambdaQueryWrapper<>();

        facultyMapper.selectPage(facultyPage, facultyLambdaQueryWrapper);

        return facultyPage;
    }
}
