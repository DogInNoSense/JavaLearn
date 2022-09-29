package com.xyz.loop;

import java.util.Scanner;

public class DeadForDemo6 {
    public static void main(String[] args) {
        // 定义死循环
//        for (int i = 0; ; i++) {
//            System.out.println("hello world");
//        }
//        while (true) {
//            System.out.println("死循环");
//        }
//        do {
//            System.out.println("死循环");
//        } while (true);

        System.out.println("-------------------------");
        // 1.定义正确密码
        int okPassword = 520;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入正确的密码");
            int password = sc.nextInt();
            if (password == okPassword) {
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误");
            }


        }
    }
}
