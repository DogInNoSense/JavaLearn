package com.xyz.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        // 目标: 学会使用java提供的随机数random
        // 1.导包
        // 2.创建随机数对象
        Random r = new Random();
        // 3.调用nextInt功能可以返回一个整型的随机数

        for (int i = 0; i < 20; i++) {
            int data = r.nextInt(10); // 0 - 9不包含10的
            System.out.println(data);
        }


        System.out.println("-------------------");


        int data = r.nextInt(10) + 1; // 1 - 10之间的
        System.out.println(data);

        // 生成 3-17 的随机数
        int data1 = r.nextInt(15) + 3;//  (0 ~ 14) + 3
        System.out.println(data1);


    }
}
