package com.ghw.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/15 19:42
 * @Version
 */
@Data
public class UserData {

    @ExcelProperty(value = "用户编号", index = 0)
    private int uid;
    @ExcelProperty(value = "用户名称", index = 1)
    private String username;


}
