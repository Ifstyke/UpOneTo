package com.ghw.yygh.hosp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ghw.yygh.common.exception.YyghException;
import com.ghw.yygh.common.result.Result;
import com.ghw.yygh.common.utils.MD5;
import com.ghw.yygh.hosp.service.HospitalSetService;
import com.ghw.yygh.model.hosp.HospitalSet;
import com.ghw.yygh.vo.hosp.HospitalSetQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/13 10:00
 * @Version
 */
@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
@CrossOrigin
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;

    // 1. 查询医院设置表所有信息
    @ApiOperation(value = "获取所有医院设置信息")
    @GetMapping("findAll")
    public Result findAllHospital() {
        //调用service中的方法
        List<HospitalSet> list = hospitalSetService.list();
        return Result.ok(list);
    }

    // 2. 删除医院信息
    @ApiOperation(value = "逻辑删除医院设置信息")
    @DeleteMapping("{id}")
    public Result removeHospSet(@PathVariable Long id) {
        boolean flag = hospitalSetService.removeById(id);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }


    //3. 条件查询带分页
    @ApiOperation(value = "查询医院信息")
    @PostMapping("findPage/{current}/{limit}")
    public Result findPageHospSet(@PathVariable Long current,
                                  @PathVariable Long limit,
                                  @RequestBody(required = false) HospitalSetQueryVo hospitalSetQueryVo) {
        //@RequestBody  接收前端传递给后端的json字符串中的数据，用于post请求
        //创建page对象，传递当前页，每页记录数
        Page<HospitalSet> page = new Page(current, limit);

        //构造查询条件
        String hosname = hospitalSetQueryVo.getHosname(); //医院名称
        String hoscode = hospitalSetQueryVo.getHoscode(); //医院编号
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        // 对条件值进行判断，如果不为空，则构造查询条件
        if (!StringUtils.isEmpty(hosname)) {
            wrapper.like("hosname", hosname);
        }
        if (!StringUtils.isEmpty(hoscode)) {
            wrapper.eq("hoscode", hoscode);
        }

        //调用方法实现分页查询
        Page<HospitalSet> hospitalSetPage = hospitalSetService.page(page, wrapper);
        //返回结果
        return Result.ok(hospitalSetPage);

    }


    //4. 添加医院设置
    @ApiOperation(value = "添加医院设置")
    @PostMapping("saveHospitalSet")
    public Result saveHospitalSet(@RequestBody HospitalSet hospitalSet) {
        //设置状态 1：可以使用 0：不可使用
        hospitalSet.setStatus(1);
        //签名秘钥
        Random random = new Random();
        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis() + "" + random.nextInt(1000)));
        boolean save = hospitalSetService.save(hospitalSet);
        if (save) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    //5. 根据id获取医院设置
    @ApiOperation(value = "根据id获取医院设置")
    @GetMapping("getHospSet/{id}")
    public Result getHospSet(@PathVariable Long id) {
        // 手动抛出异常
        // try {
        //     int i = 1 / 0;
        // }catch (Exception e){
        //     throw new YyghException("失败",201);
        // }
        //  int i = 1 / 0;
        HospitalSet hospitalSet = hospitalSetService.getById(id);

        return Result.ok(hospitalSet);
    }

    //6. 修改医院设置
    @ApiOperation(value = "修改医院设置")
    @PostMapping("updateHospSet")
    public Result updateHospSet(@RequestBody HospitalSet hospitalSet) {
        boolean flag = hospitalSetService.updateById(hospitalSet);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    //7. 批量删除医院设置接口
    @ApiOperation("批量删除医院设置")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        boolean flag = hospitalSetService.removeByIds(idList);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }

    //8. 医院设置锁定和解锁
    @ApiOperation(value = "医院设置锁定和解锁")
    @PutMapping("lockHospSet/{id}/{status}")
    public Result lockHospSet(@PathVariable long id,
                              @PathVariable Integer status) {
        //根据id查询设置信息
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        //设置状态
        hospitalSet.setStatus(status);
        //调用方法
        hospitalSetService.updateById(hospitalSet);
        return Result.ok();
    }

    //9. 发送签名的秘钥KEY
    @ApiOperation(value = "发送签名的秘钥KEY")
    @PutMapping("sendKey/{id}")
    public Result lockHospSet(@PathVariable long id) {
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        String signKey = hospitalSet.getSignKey();
        String hoscode = hospitalSet.getHoscode();
        //发送短信
        return Result.ok();
    }
}