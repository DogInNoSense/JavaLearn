package com.xyz.demo;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 键盘录入一组工号,最终要随机输出一组来作为排名
        // 1.动态初始化一个数组,存储5个工号
        int[] codes = new int[5];

        // 2.定义一个循环,循环5次,录入一个工号存入对应位置
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个工号");
            int code = sc.nextInt();
            // 存入数组
            codes[i] = code;

        }
        Random r = new Random();

        // 3.遍历数组中的每个元素,然后随机一个索引出来,让该元素与随机索引位置处的元素值交换
        for (int i = 0; i < codes.length; i++) {
            // 当前遍历的元素值: codes[i]
            // 随机一个索引位置出来 codes[index]
            int index = r.nextInt(codes.length);
            // 交换数组元素位置
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        // 4.遍历数组元素输出结果
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i] + "\t");
        }
    }
}
