package com.ghw.yygh.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghw.yygh.model.order.PaymentInfo;
import com.ghw.yygh.model.order.RefundInfo;

/**
 * @author lijian
 * @create 2021-05-05 11:49
 */
public interface RefundInfoService extends IService<RefundInfo> {
    //保存退款记录
    RefundInfo saveRefundInfo(PaymentInfo paymentInfo);
}
