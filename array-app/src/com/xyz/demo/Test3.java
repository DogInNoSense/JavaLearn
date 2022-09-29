package com.xyz.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        // 5个 1-20之间的随机数,让用户猜测,猜中要提示猜中,还要输出该数据在数组中第一次出现的索引,并打印数组内容出来.
        // 没有猜中继续

        // 1.定义一个动态初始化的数组存储5个随机的1-20之间的数据
        int[] data = new int[5];
        // 2.动态的生成5个1-20之间的随机数并存入到数组中去
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
        }
        Scanner sc = new Scanner(System.in);
        // 3.使用一个死循环让用户猜测
        OUT:
        // 用来结束整个死循环
        while (true) {
            System.out.println("请您输入一个1-20之间的数字");
            int guessData = sc.nextInt();
            // 4.遍历数组中的数据看和猜测的数据有没有相同的
            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessData) {
                    System.out.println("您已经猜中了该数据,您猜中的索引在" + i);
                    break OUT; // 结束整个死循环
                }
            }
            System.out.println("请重新猜测");
        }
        // 5.输出数组全部元素让用户对比
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }

    }
}
