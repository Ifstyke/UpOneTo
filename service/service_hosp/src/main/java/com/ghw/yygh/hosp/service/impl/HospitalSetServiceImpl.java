package com.ghw.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghw.yygh.hosp.mapper.HospitalSetMapper;
import com.ghw.yygh.hosp.service.HospitalSetService;
import com.ghw.yygh.model.hosp.HospitalSet;
import org.springframework.stereotype.Service;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/13 09:57
 * @Version
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {


    @Override
    public String getSignKey(String hoscode) {

        QueryWrapper<HospitalSet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hoscode", hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(queryWrapper);

        return hospitalSet.getSignKey();
    }
}
