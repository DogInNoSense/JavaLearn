package com.xyz.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        // 学会使用for循环
        for (int i = 0; i < 3; i++) {
            System.out.println("hello world");
        }

        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

        // 求奇数和
//
//        int sum1 = 0;
//        for (int x = 1; x <= 10; x += 2) {
//            sum1 = sum1 + x;
//        }
//        System.out.println(sum1);
        int sum1 = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 1)
                sum1 = sum1 + x;
        }
        System.out.println(sum1);
    }
}
