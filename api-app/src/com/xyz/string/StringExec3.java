package com.xyz.string;

import java.util.Scanner;

public class StringExec3 {
    public static void main(String[] args) {
        // 练习:手机号码屏蔽
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码:");
        String number = sc.next();
        String s1 = number.substring(0, 3);
        String s2 = number.substring(7);
        System.out.println(s1 + "****" + s2);

    }
}
