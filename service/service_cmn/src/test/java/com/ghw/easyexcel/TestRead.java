package com.ghw.easyexcel;

import com.alibaba.excel.EasyExcel;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/15 19:59
 * @Version
 */
public class TestRead {

    public static void main(String[] args) {


        // 读取文件路径
        String filename = "/Users/ifstyle/LearningProject/testExcel/01.xlsx";
        // 调用方法实现读取操作
        EasyExcel.read(filename, UserData.class, new ExcelListener()).sheet().doRead();
    }
}
