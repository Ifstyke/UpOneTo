package com.ghw.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghw.yygh.common.exception.YyghException;
import com.ghw.yygh.common.result.ResultCodeEnum;
import com.ghw.yygh.hosp.mapper.HospitalSetMapper;
import com.ghw.yygh.hosp.service.HospitalSetService;
import com.ghw.yygh.model.hosp.HospitalSet;
import com.ghw.yygh.vo.order.SignInfoVo;
import org.springframework.stereotype.Service;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/13 09:57
 * @Version
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

    // 根据传递过来的医院编码，查询数据库，查询签名
    @Override
    public String getSignKey(String hoscode) {

        QueryWrapper<HospitalSet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hoscode", hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(queryWrapper);

        return hospitalSet.getSignKey();
    }

    //获取医院签名信息
    @Override
    public SignInfoVo getSignInfoVo(String hoscode) {
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        wrapper.eq("hoscode",hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(wrapper);
        if(null == hospitalSet) {
            throw new YyghException(ResultCodeEnum.HOSPITAL_OPEN);
        }
        SignInfoVo signInfoVo = new SignInfoVo();
        signInfoVo.setApiUrl(hospitalSet.getApiUrl());
        signInfoVo.setSignKey(hospitalSet.getSignKey());
        return signInfoVo;
    }
}
