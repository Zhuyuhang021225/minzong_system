package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.PowersAndResponsibilities;
import com.zhifei.minzong_system.mapper.PowersAndResponsibilitiesMapper;
import com.zhifei.minzong_system.service.PowersAndResponsibilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class PowersAndResponsibilitiesServiceImpl extends ServiceImpl<PowersAndResponsibilitiesMapper, PowersAndResponsibilities> implements PowersAndResponsibilitiesService {

    @Autowired
    private PowersAndResponsibilitiesMapper powersAndResponsibilitiesMapper;

    @Override
    public Page<PowersAndResponsibilities> getAllPowersAndResponsibilitiesPage(Integer current, Integer pageSize) {
        Page<PowersAndResponsibilities> powersAndResponsibilitiesPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<PowersAndResponsibilities> powersAndResponsibilitiesLambdaQueryWrapper = new LambdaQueryWrapper<>();

        powersAndResponsibilitiesMapper.selectPage(powersAndResponsibilitiesPage, powersAndResponsibilitiesLambdaQueryWrapper);

        return powersAndResponsibilitiesPage;
    }
}
