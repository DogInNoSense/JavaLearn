package com.xyz.demo;

public class Test1 {
    public static void main(String[] args) {
        // 使用方法计算1-n的和
        System.out.println(sum(5));
        System.out.println("1-100的和是:" + sum(100));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
