package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Personnel;
import com.zhifei.minzong_system.service.impl.PersonnelServiceImpl;
import com.zhifei.minzong_system.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月22日 11:17
 */

@RestController
@RequestMapping("/personnel")
@Api(tags = {"民宗部门人员信息访问接口"})
public class PersonnelController {

    @Autowired
    private PersonnelServiceImpl personnelService;

    @ApiOperation("获取所有民宗人员信息")
    @GetMapping()
    @Transactional
    public Result<Page> getAllPersonnelPage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页人员参数错误");
        }

        Page<Personnel> allPersonnelPage = personnelService.getAllPersonnelPage(current, pageSize);

        return Result.success(allPersonnelPage);
    }

    @PostMapping
    @ApiOperation("新增民宗人员信息")
    @Transactional
    public Result<String> addPersonnel(@RequestBody @ApiParam(value = "新增的人员信息") Personnel personnel){
        if (personnel == null){
            return Result.error("新增人员参数错误");
        }

        if (!personnelService.save(personnel)){
            return Result.error("新增人员错误，稍后再试");
        }

        return Result.success("新增人员成功！");
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除民宗人员信息")
    @Transactional
    public Result<String> deletePersonnel(@PathVariable("id") @ApiParam(value = "删除的人员ID") Integer id){
        if (id == null){
            return Result.error("删除人员参数错误");
        }

        if (!personnelService.removeById(id)){
            return Result.error("删除人员错误，稍后再试");
        }

        return Result.success("删除人员成功！");
    }

    @PutMapping
    @ApiOperation("更新民宗人员信息")
    @Transactional
    public Result<String> updatePersonnel(@RequestBody @ApiParam(value = "更新的人员ID") Personnel personnel){
        if (personnel == null){
            return Result.error("更新人员参数错误");
        }

        if (!personnelService.updateById(personnel)){
            return Result.error("更新人员错误，稍后再试");
        }

        return Result.success("更新人员成功！");
    }

    @GetMapping("/institution_name/{institution_name}")
    @ApiOperation(value = "按机构名称获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByInstitutionName(@PathVariable("institution_name") @ApiParam(value = "机构名称") String institutionName, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (institutionName == null || current == null || pageSize == null){
            return Result.error("按机构名称获取民宗人员信息错误");
        }

        Page<Personnel> personnelByInstitutionName = personnelService.getPersonnelByInstitutionName(institutionName, current, pageSize);

        return Result.success(personnelByInstitutionName);
    }

    @GetMapping("/duties/{duties}")
    @ApiOperation(value = "按职务获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByDuties(@PathVariable("duties") @ApiParam(value = "职务") String duties, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (duties == null || current == null || pageSize == null){
            return Result.error("按职务获取民宗人员信息错误");
        }

        Page<Personnel> personnelByDuties = personnelService.getPersonnelByDuties(duties, current, pageSize);

        return Result.success(personnelByDuties);
    }

    @GetMapping("/weave/{weave}")
    @ApiOperation(value = "按编制获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByWeave(@PathVariable("weave") @ApiParam(value = "编制") String weave, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (weave == null || current == null || pageSize == null){
            return Result.error("按编制获取民宗人员信息错误");
        }

        Page<Personnel> personnelByWeave = personnelService.getPersonnelByWeave(weave, current, pageSize);

        return Result.success(personnelByWeave);
    }

    @GetMapping("/degree/{degree}")
    @ApiOperation(value = "按学历获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByDegree(@PathVariable("degree") @ApiParam(value = "学历") String degree, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (degree == null || current == null || pageSize == null){
            return Result.error("按学历获取民宗人员信息错误");
        }

        Page<Personnel> personnelByDegree = personnelService.getPersonnelByDegree(degree, current, pageSize);

        return Result.success(personnelByDegree);
    }

    @GetMapping("/state/{state}")
    @ApiOperation(value = "按状态获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByState(@PathVariable("state") @ApiParam(value = "状态") String state, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (state == null || current == null || pageSize == null){
            return Result.error("按状态获取民宗人员信息错误");
        }

        Page<Personnel> personnelByState = personnelService.getPersonnelByState(state, current, pageSize);

        return Result.success(personnelByState);
    }

    @GetMapping("/political_outlook/{political_outlook}")
    @ApiOperation(value = "按政治面貌获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByPoliticalOutlook(@PathVariable("political_outlook") @ApiParam(value = "政治面貌") String politicalOutlook, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (politicalOutlook == null || current == null || pageSize == null){
            return Result.error("按政治面貌获取民宗人员信息错误");
        }

        Page<Personnel> personnelByPoliticalOutlook = personnelService.getPersonnelByPoliticalOutlook(politicalOutlook, current, pageSize);

        return Result.success(personnelByPoliticalOutlook);
    }

    @GetMapping("/inner_institution_name/{inner_institution_name}")
    @ApiOperation(value = "按单位获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByInnerInstitutionName(@PathVariable("inner_institution_name") @ApiParam(value = "单位") String innerInstitutionName, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (innerInstitutionName == null || current == null || pageSize == null){
            return Result.error("按单位获取民宗人员信息错误");
        }

        Page<Personnel> personnelByInnerInstitutionName = personnelService.getPersonnelByInnerInstitutionName(innerInstitutionName, current, pageSize);

        return Result.success(personnelByInnerInstitutionName);
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value = "按姓名获取民宗人员信息")
    @Transactional
    public Result<Page> getPersonnelByName(@PathVariable("name") @ApiParam(value = "姓名") String name, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (name == null || current == null || pageSize == null){
            return Result.error("按姓名获取民宗人员信息错误");
        }

        Page<Personnel> personnelByName = personnelService.getPersonnelByName(name, current, pageSize);

        return Result.success(personnelByName);
    }
}
