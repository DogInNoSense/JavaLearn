package com.xyz.demo;

public class Test2 {
    // 判断整数是奇数还是偶数 并进行结果的输出
    public static void main(String[] args) {
        check(100);
    }

    public static void check(int n) {
        if (n % 2 == 1) {
            System.out.println(n + "是奇数");
        } else {
            System.out.println(n + "是偶数");
        }
    }
}
