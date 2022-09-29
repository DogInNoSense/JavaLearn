package com.xyz.create;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 动态初始化数组的定义和使用
        double[] scores = new double[3]; // [0.0, 0.0, 0.0]

        // 赋值
        scores[0] = 99.5;
        System.out.println(scores[0]);

        System.out.println(scores[2]);// 未赋值

        String[] names = new String[90];
        names[0] = "xyz";
        names[1] = "zyx";
        System.out.println(names[3]);// null
    }
}
