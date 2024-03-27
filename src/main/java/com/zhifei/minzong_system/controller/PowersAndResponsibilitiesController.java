package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.PowersAndResponsibilities;
import com.zhifei.minzong_system.service.impl.PowersAndResponsibilitiesServiceImpl;
import com.zhifei.minzong_system.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:16
 */
@RestController
@RequestMapping("/powersAndResponsibilities")
@Api(tags = {"行政权力和责任信息访问接口"})
public class PowersAndResponsibilitiesController {

    @Autowired
    private PowersAndResponsibilitiesServiceImpl powersAndResponsibilitiesService;

    @ApiOperation("获取所有行政权力和责任信息")
    @GetMapping()
    @Transactional
    public Result<Page> getAllPowersAndResponsibilitiesPage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页行政权力和责任信息参数错误");
        }

        Page<PowersAndResponsibilities> allPowersAndResponsibilitiesPage = powersAndResponsibilitiesService.getAllPowersAndResponsibilitiesPage(current, pageSize);

        return Result.success(allPowersAndResponsibilitiesPage);
    }
}
