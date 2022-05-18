package com.ghw.easyexcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/15 19:46
 * @Version
 */
public class TestView {


    public static void main(String[] args) {
        // 构建数组List集合
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData data = new UserData();
            data.setUid(i);
            data.setUsername("张" + i);
            list.add(data);
        }
        // 设置excel文件路径和文件名称
        String fileName = "/Users/ifstyle/LearningProject/testExcel/01.xlsx";

        // 调用方法实现写操作
        EasyExcel.write(fileName, UserData.class).sheet("用户信息").doWrite(list);
    }
}
