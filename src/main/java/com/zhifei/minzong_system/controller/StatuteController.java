package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.minzongWorkDepartmentDataBase.Statute;
import com.zhifei.minzong_system.service.impl.StatuteServiceImpl;
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
@RequestMapping("/statutes")
@Api(tags = {"民宗宗教政策法规信息访问接口"})
public class StatuteController {

    @Autowired
    private StatuteServiceImpl statuteService;

    @ApiOperation("获取所有宗教政策法规信息")
    @GetMapping()
    @Transactional
    public Result<Page> getAllStatutePage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页宗教政策法规参数错误");
        }

        Page<Statute> allStatutePage = statuteService.getAllStatutePage(current, pageSize);

        return Result.success(allStatutePage);
    }
}
