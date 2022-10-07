package com.xyz.string;

import java.util.Random;

public class StringExec1 {
    public static void main(String[] args) {
        // 1.定义可能出现的字符信息

        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "";
        // 2.循环5次,每次随机生成一个索引,提取相应字符
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            // 随机一个索引
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code += c;
        }
        System.out.println(code);
    }
}
