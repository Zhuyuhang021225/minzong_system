package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.Personnel;
import com.zhifei.minzong_system.entity.Statute;
import com.zhifei.minzong_system.mapper.StatuteMapper;
import com.zhifei.minzong_system.service.StatuteService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class StatuteServiceImpl extends ServiceImpl<StatuteMapper, Statute> implements StatuteService {

    @Autowired
    private StatuteMapper statuteMapper;

    @Override
    public Page<Statute> getAllStatutePage(Integer current, Integer pageSize) {
        Page<Statute> statutePage = new Page<>(current, pageSize);
        LambdaQueryWrapper<Statute> statuteLambdaQueryWrapper = new LambdaQueryWrapper<>();

        statuteMapper.selectPage(statutePage, statuteLambdaQueryWrapper);

        return statutePage;
    }
}
