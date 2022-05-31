package com.ghw.yygh.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghw.yygh.model.order.OrderInfo;
import com.ghw.yygh.vo.order.OrderCountQueryVo;
import com.ghw.yygh.vo.order.OrderCountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lijian
 * @create 2021-05-03 18:37
 */
public interface OrderMapper extends BaseMapper<OrderInfo> {
    //查询预约统计数据的方法
    List<OrderCountVo> selectOrderCount(@Param("vo") OrderCountQueryVo orderCountQueryVo);  //vo 别名
}
