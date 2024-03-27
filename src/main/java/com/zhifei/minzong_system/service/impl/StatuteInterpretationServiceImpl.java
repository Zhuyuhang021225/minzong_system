package com.zhifei.minzong_system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhifei.minzong_system.entity.Statute;
import com.zhifei.minzong_system.entity.StatuteInterpretation;
import com.zhifei.minzong_system.mapper.StatuteInterpretationMapper;
import com.zhifei.minzong_system.mapper.StatuteMapper;
import com.zhifei.minzong_system.service.StatuteInterpretationService;
import com.zhifei.minzong_system.service.StatuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Zhuyuhang
 * @Project: minzong_system
 * @Date: 2024年03月27日 16:14
 */
@Service
public class StatuteInterpretationServiceImpl extends ServiceImpl<StatuteInterpretationMapper, StatuteInterpretation> implements StatuteInterpretationService {

    @Autowired
    private StatuteInterpretationMapper statuteInterpretationMapper;

    @Override
    public Page<StatuteInterpretation> getAllStatuteInterpretationPage(Integer current, Integer pageSize) {
        Page<StatuteInterpretation> statuteInterpretationPage = new Page<>(current, pageSize);
        LambdaQueryWrapper<StatuteInterpretation> statuteInterpretationLambdaQueryWrapper = new LambdaQueryWrapper<>();

        statuteInterpretationMapper.selectPage(statuteInterpretationPage, statuteInterpretationLambdaQueryWrapper);

        return statuteInterpretationPage;
    }
}
