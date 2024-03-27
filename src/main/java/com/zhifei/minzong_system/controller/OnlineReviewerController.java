package com.zhifei.minzong_system.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhifei.minzong_system.entity.OnlineReviewer;
import com.zhifei.minzong_system.entity.StatuteInterpretation;
import com.zhifei.minzong_system.service.impl.OnlineReviewerServiceImpl;
import com.zhifei.minzong_system.service.impl.StatuteInterpretationServiceImpl;
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
@RequestMapping("/onlineReviewers")
@Api(tags = {"网评员队伍数据信息访问接口"})
public class OnlineReviewerController {

    @Autowired
    private OnlineReviewerServiceImpl onlineReviewerService;

    @ApiOperation("获取所有网评员队伍数据信息")
    @GetMapping()
    @Transactional
    public Result<Page> getAllOnlineReviewerPage(@ApiParam(value = "页码") @RequestParam Integer current, @ApiParam(value = "分页大小") @RequestParam Integer pageSize){
        if (current == null || pageSize == null){
            return Result.error("分页网评员队伍数据信息参数错误");
        }

        Page<OnlineReviewer> allOnlineReviewerPage = onlineReviewerService.getAllOnlineReviewerPage(current, pageSize);

        return Result.success(allOnlineReviewerPage);
    }
}
