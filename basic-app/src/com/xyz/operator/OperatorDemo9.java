package com.xyz.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        // 运算优先级
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);//true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);//false
    }
}
