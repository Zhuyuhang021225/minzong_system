package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.religionWorkDataBase.EventVenues;
import com.zhifei.minzong_system.entity.religionWorkDataBase.VenuesFiance;
import com.zhifei.minzong_system.service.impl.EventVenuesServiceImpl;
import com.zhifei.minzong_system.service.impl.VenuesFianceServiceImpl;
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
@RequestMapping("/venuesFiance")
@Api(tags = {"宗教活动场所财务信息访问接口"})
public class VenuesFianceController {

    @Autowired
    private VenuesFianceServiceImpl venuesFianceService;

    @ApiOperation("获取所有宗教活动场所财务信息")
    @GetMapping()
    @Transactional
    public Result<Page> getAllVenuesFiancePage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页宗教活动场所财务信息参数错误");
        }

        Page<VenuesFiance> allVenuesFiancePage = venuesFianceService.getAllVenuesFiancePage(current, pageSize);

        return Result.success(allVenuesFiancePage);
    }
}
