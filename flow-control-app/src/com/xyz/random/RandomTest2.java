package com.xyz.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        // 1.随机一个幸运号码 1 - 100之间
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;
        // 2.使用一个死循环 让用户不断猜测
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请你输入要猜测的数据");
            int guestNumber = sc.nextInt();
            if (guestNumber <= 0 || guestNumber >= 101) {
                System.out.println("数据不合法!");
                break;
            } else if (luckNumber > guestNumber) {
                System.out.println("猜小了,再试一次!");
            } else if (luckNumber < guestNumber) {
                System.out.println("猜大了,再试一次");
            } else if (luckNumber == guestNumber) {
                System.out.println("猜对了!");
                break;
            }

        }

    }
}
