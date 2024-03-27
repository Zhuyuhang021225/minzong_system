package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Department;
import com.zhifei.minzong_system.service.impl.DepartmentServiceImpl;
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
 * @Date: 2024年03月22日 09:58
 */
@RestController
@RequestMapping("/department")
@Api(tags = {"民宗部门基础信息访问接口"})
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @ApiOperation(value = "获取所有民宗部门基础信息")
    @GetMapping()
    @Transactional
    public Result<Page> getAllDepartmentPage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam("分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页部门参数错误");
        }

        Page<Department> allDepartmentPage = departmentService.getAllDepartmentPage(current, pageSize);

        return Result.success(allDepartmentPage);
    }

    @PostMapping
    @ApiOperation(value = "新增民宗部门基础信息")
    @Transactional
    public Result<String> addDepartment(@ApiParam(value = "新增部门信息") @RequestBody Department department){
        if (department == null){
            return Result.error("新增部门参数错误");
        }

        if (!departmentService.save(department)){
            return Result.error("新增部门错误，稍后再试");
        }

        return Result.success("新增部门成功！");
    }

    @ApiOperation(value = "删除民宗部门基础信息")
    @DeleteMapping("/{id}")
    @Transactional
    public Result<String> deleteDepartment(@PathVariable("id") @ApiParam(value = "删除的部门ID") Integer id){
        if (id == null){
            return Result.error("删除部门参数错误");
        }

        if (!departmentService.removeById(id)){
            return Result.error("删除部门错误，稍后再试");
        }

        return Result.success("删除部门成功！");
    }

    @PutMapping
    @ApiOperation(value = "更新民宗部门基础信息")
    @Transactional
    public Result<String> updateDepartment(@RequestBody @ApiParam(value = "更新的部门信息") Department department){
        if (department == null){
            return Result.error("更新部门参数错误");
        }

        if (!departmentService.updateById(department)){
            return Result.error("更新部门错误，稍后再试");
        }

        return Result.success("更新部门成功！");
    }

    @GetMapping("/area/{area}")
    @ApiOperation(value = "按地区获取民宗部门基础信息")
    @Transactional
    public Result<Page> getDepartmentByArea(@PathVariable("area") @ApiParam(value = "地区") String area, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (area == null || current == null || pageSize == null){
            return Result.error("按地区查询部门参数错误");
        }

        Page<Department> departmentByArea = departmentService.getDepartmentByArea(area, current, pageSize);

        return Result.success(departmentByArea);
    }

    @GetMapping("/level/{level}")
    @ApiOperation(value = "按机构级别获取民宗部门基础信息")
    @Transactional
    public Result<Page> getDepartmentByLevel(@PathVariable("level") @ApiParam(value = "机构级别") String level, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (level == null || current == null || pageSize == null){
            return Result.error("按级别查询部门参数错误");
        }

        Page<Department> departmentByLevel = departmentService.getDepartmentByLevel(level, current, pageSize);

        return Result.success(departmentByLevel);
    }

    @GetMapping("/quality/{quality}")
    @ApiOperation(value = "按机构性质获取民宗部门基础信息")
    @Transactional
    public Result<Page> getDepartmentByQuality(@PathVariable("quality") @ApiParam(value = "机构性质") String quality, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (quality == null || current == null || pageSize == null){
            return Result.error("按性质查询部门参数错误");
        }

        Page<Department> departmentByQuality = departmentService.getDepartmentByQuality(quality, current, pageSize);

        return Result.success(departmentByQuality);
    }

    @GetMapping("/leader/{leader}")
    @ApiOperation(value = "按负责人获取民宗部门基础信息")
    @Transactional
    public Result<Page> getDepartmentByLeader(@PathVariable("leader") @ApiParam(value = "负责人") String leader, @ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (leader == null || current == null || pageSize == null){
            return Result.error("按负责人查询部门参数错误");
        }

        Page<Department> departmentByLeader = departmentService.getDepartmentByLeader(leader, current, pageSize);

        return Result.success(departmentByLeader);
    }
}
