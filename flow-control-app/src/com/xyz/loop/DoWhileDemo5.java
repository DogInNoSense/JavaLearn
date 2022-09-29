package com.xyz.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        // 学会使用do while循环
        int i = 0;
        do {
            System.out.println("hello world");
            i++;
        } while (i < 3);

        // for while 先判断后执行
        // do while 第一次执行后判断

        for (int j = 0; j < 3; j++) {
            System.out.println("hello world");
        }
//        System.out.println(j); // 外面不能使用
    }
}
