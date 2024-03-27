package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Personnel;
import com.zhifei.minzong_system.mapper.PersonnelMapper;
import com.zhifei.minzong_system.service.PersonnelService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月22日 11:16
 */
@Service
public class PersonnelServiceImpl extends ServiceImpl<PersonnelMapper, Personnel> implements PersonnelService {

    @Autowired
    private PersonnelMapper personnelMapper;

    @Override
    public Page<Personnel> getAllPersonnelPage(Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByInstitutionName(String institutionName, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(institutionName), Personnel::getInstitutionName, institutionName);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByDuties(String duties, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(duties), Personnel::getDuties, duties);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByWeave(String weave, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(weave), Personnel::getWeave, weave);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByDegree(String degree, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(degree), Personnel::getDegree, degree);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByState(String state, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(state), Personnel::getState, state);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByPoliticalOutlook(String politicalOutlook, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(politicalOutlook), Personnel::getPoliticalOutlook, politicalOutlook);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByInnerInstitutionName(String innerInstitutionName, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(innerInstitutionName), Personnel::getPoliticalOutlook, innerInstitutionName);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }

    @Override
    public Page<Personnel> getPersonnelByName(String name, Integer current, Integer pageSize) {
        Page<Personnel> personnelPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Personnel> personnelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        personnelLambdaQueryWrapper.eq(Strings.isNotEmpty(name), Personnel::getPoliticalOutlook, name);

        personnelMapper.selectPage(personnelPage, personnelLambdaQueryWrapper);

        return personnelPage;
    }
}
