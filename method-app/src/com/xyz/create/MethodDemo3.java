package com.xyz.create;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 学会方法定义的其他形式
        print(10);
        prints();
    }

    public static void prints() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("xyz");
        }
    }
}
