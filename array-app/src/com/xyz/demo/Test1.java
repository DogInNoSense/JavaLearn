package com.xyz.demo;

public class Test1 {
    public static void main(String[] args) {
        // 数组元素求和
        int money[] = {16, 32, 8, 100, 78};

        // 遍历每个元素求和
        // money.fori
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}
