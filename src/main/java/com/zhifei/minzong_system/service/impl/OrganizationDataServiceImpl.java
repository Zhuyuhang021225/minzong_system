package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.religionWorkDataBase.EventVenues;
import com.zhifei.minzong_system.entity.religionWorkDataBase.OrganizationData;
import com.zhifei.minzong_system.mapper.EventVenuesMapper;
import com.zhifei.minzong_system.mapper.OrganizationDataMapper;
import com.zhifei.minzong_system.service.EventVenuesService;
import com.zhifei.minzong_system.service.OrganizationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class OrganizationDataServiceImpl extends ServiceImpl<OrganizationDataMapper, OrganizationData> implements OrganizationDataService {

    @Autowired
    private OrganizationDataMapper organizationDataMapper;

    @Override
    public Page<OrganizationData> getAllOrganizationDataPage(Integer current, Integer pageSize) {
        Page<OrganizationData> organizationDataPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<OrganizationData> organizationDataLambdaQueryWrapper = new LambdaQueryWrapper<>();

        organizationDataMapper.selectPage(organizationDataPage, organizationDataLambdaQueryWrapper);

        return organizationDataPage;
    }
}
