package com.xyz.loop;

public class ForForDemo7 {
    public static void main(String[] args) {
        // 理解嵌套循环的执行流程
        // 嵌套循环
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i like you");
            }
            System.out.println("-------------");
        }

        // 4行5列
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");//不换行
            }
            System.out.println();//换行
        }
    }
}
