package com.zhifei.minzong_system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Personnel;

/**
*@author: Zhuyuhang
*@Project: minzong_system
*@Date: 2024年03月22日 11:15
*/

public interface PersonnelService extends IService<Personnel> {

    Page<Personnel> getAllPersonnelPage(Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByInstitutionName(String institutionName, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByDuties(String duties, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByWeave(String weave, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByDegree(String degree, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByState(String state, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByPoliticalOutlook(String politicalOutlook, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByInnerInstitutionName(String innerInstitutionName, Integer current, Integer pageSize);

    Page<Personnel> getPersonnelByName(String name, Integer current, Integer pageSize);

}
