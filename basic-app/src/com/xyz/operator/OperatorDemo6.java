package com.xyz.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标:学会使用关系运算符
        int a = 10;
        int b = 10;
        boolean rs = a == b;
        System.out.println(rs);

        System.out.println(a == b);//true
        System.out.println(a != b);//false
        System.out.println(a > b);//false
        System.out.println(a >= b);//true
        System.out.println(a < b);//false
        System.out.println(a <= b); //true

        int i = 10;
        int j = 5;

        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i > j);
        System.out.println(i >= j);
        System.out.println(i < j);
        System.out.println(i <= j);

    }
}