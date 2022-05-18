package com.ghw.yygh.hosp.repository;

import com.ghw.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {


    //判断是否存在数据
    Hospital getHospitalByHoscode(String hoscode);  //MongoRepository有一套规范，直接按照规范命名，会直接调用写好的方法

    //根据医院名称查询
    List<Hospital> findHospitalByHosnameLike(String hosname);
}
