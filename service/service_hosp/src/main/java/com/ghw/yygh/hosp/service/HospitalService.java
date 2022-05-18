package com.ghw.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghw.yygh.model.hosp.Hospital;
import com.ghw.yygh.vo.hosp.HospitalQueryVo;

import java.util.List;
import java.util.Map;

public interface HospitalService {
    void save(Map<String, Object> parampMap);

    //实现根据医院编号查询
    Hospital getByHoscode(String hoscode);

    // //医院列表(条件查询分页)
    // Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);
    //
    // //更新医院的上限状态
    // void updateStatus(String id, Integer status);
    //
    // //查询医院详情
    // Map<String, Object> getHospById(String id);
    //
    //获取医院名称
    String getHospName(String hoscode);
    //
    // //根据医院名称查询
    // List<Hospital> findByHosname(String hosname);
    //
    // //根据医院编号获取预约挂号详情
    // Map<String, Object> item(String hoscode);
}
