package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.religionWorkDataBase.Faculty;
import com.zhifei.minzong_system.entity.religionWorkDataBase.OrganizationData;
import com.zhifei.minzong_system.service.impl.FacultyServiceImpl;
import com.zhifei.minzong_system.service.impl.OrganizationDataServiceImpl;
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
@RequestMapping("/faculty")
@Api(tags = {"宗教教职人员数据信息访问接口"})
public class FacultyController {

    @Autowired
    private FacultyServiceImpl eventVenuesService;

    @ApiOperation("获取所有宗教教职人员数据信息")
    @GetMapping()
    @Transactional
    public Result<Page> getFacultyPage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页宗教教职人员数据信息参数错误");
        }

        Page<Faculty> allFacultyPage = eventVenuesService.getAllFacultyPage(current, pageSize);

        return Result.success(allFacultyPage);
    }
}
