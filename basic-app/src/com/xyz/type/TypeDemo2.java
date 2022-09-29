package com.xyz.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 掌握表达式的自动类型转换的规则
        byte a = 10;
        int b = 20;
        double c = 1.0;
        double rs = a + b + c;
        System.out.println(rs);
        double rs2 = a + b - 2.3;
        // 面试题
        byte i = 100;
        byte j = 120;
        int k = i + j;
    }
}
