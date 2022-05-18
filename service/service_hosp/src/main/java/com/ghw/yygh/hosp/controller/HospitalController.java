package com.ghw.yygh.hosp.controller;

import com.ghw.yygh.common.result.Result;
import com.ghw.yygh.hosp.service.HospitalService;
import com.ghw.yygh.model.hosp.Hospital;
import com.ghw.yygh.vo.hosp.HospitalQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/18 10:46
 * @Version
 */
@Api(tags = "医院管理")
@RestController
@RequestMapping("/admin/hosp/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    //医院列表(条件查询分页)
    @ApiOperation("医院列表")
    @GetMapping("list/{page}/{limit}")
    public Result listHosp(@PathVariable Integer page,
                           @PathVariable Integer limit,
                           HospitalQueryVo hospitalQueryVo) {  //将查询的条件参数封装到了HospitalSetQueryVo中
        //此时医院的数据存在于mongodb中
        Page<Hospital> pageModel = hospitalService.selectHospPage(page, limit, hospitalQueryVo);
        List<Hospital> content = pageModel.getContent();
        long totalElements = pageModel.getTotalElements();
        return Result.ok(pageModel);
    }

    //更新医院的上线状态
    @ApiOperation("更新医院的上线状态")
    @GetMapping("updateHospStatus/{id}/{status}")
    public Result updateHospStatus(@PathVariable("id") String id,
                                   @PathVariable("status") Integer status) {
        hospitalService.updateStatus(id, status);
        return Result.ok();
    }

    //查询医院详情
    @ApiOperation("查询医院详情")
    @GetMapping("showHospDetail/{id}")
    public Result showHospDetail(@PathVariable("id") String id) {
        //为了方便后续取值方便，此处查询不用Hospital接受，而是放在集合里面
        Map<String, Object> map = hospitalService.getHospById(id);
        return Result.ok(map);
    }
}
