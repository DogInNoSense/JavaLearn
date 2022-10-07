package com.xyz.string;

import java.util.Scanner;

public class StringExec2 {
    public static void main(String[] args) {
        // 1.定义正确的名称和密码
        String okLoginName = "admin";
        String okPassword = "xyz";
        Scanner sc = new Scanner(System.in);
        // 2.定义一个循环,循环3次让用户登陆
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入登陆名称");
            String loginName = sc.next();
            System.out.println("请您输入登陆密码");
            String password = sc.next();

            // 3.判断登陆是否成功
            if (okLoginName.equals(loginName)) {
                // 4.判断密码是否正确
                if (okPassword.equals(password)) {
                    System.out.println("登陆成功!");
                    break;
                } else {
                    System.out.println("密码不正确,您还剩余" + (2- i) + "次机会登陆!");
                }
            } else {
                System.out.println("登录名错误了,您还剩余" + (2 - i) + "次机会登陆!");
            }
        }
    }
}
