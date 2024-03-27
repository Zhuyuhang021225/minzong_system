package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.EnforcementOfficer;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.StatuteInterpretation;
import com.zhifei.minzong_system.mapper.EnforcementOfficerMapper;
import com.zhifei.minzong_system.mapper.StatuteInterpretationMapper;
import com.zhifei.minzong_system.service.EnforcementOfficerService;
import com.zhifei.minzong_system.service.StatuteInterpretationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class EnforcementOfficerServiceImpl extends ServiceImpl<EnforcementOfficerMapper, EnforcementOfficer> implements EnforcementOfficerService {

    @Autowired
    private EnforcementOfficerMapper enforcementOfficerMapper;

    @Override
    public Page<EnforcementOfficer> getAllEnforcementOfficerPage(Integer current, Integer pageSize) {
        Page<EnforcementOfficer> enforcementOfficerPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<EnforcementOfficer> enforcementOfficerLambdaQueryWrapper = new LambdaQueryWrapper<>();

        enforcementOfficerMapper.selectPage(enforcementOfficerPage, enforcementOfficerLambdaQueryWrapper);

        return enforcementOfficerPage;
    }
}
