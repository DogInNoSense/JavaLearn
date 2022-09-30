package com.xyz.create;
// 使用方法的优点
// 1.可以提高代码的复用性和开发效率
// 2.让程序的逻辑更清晰

public class MethodDeom1 {
    public static void main(String[] args) {
        // 张工
        int a = 10;
        int b = 30;
        int c = a + b;
        System.out.println(c);
        // 徐工
        int a1 = 10;
        int b1 = 30;
        int c1 = a1 + b1;
        System.out.println(c1);
        // 调用方法
        System.out.println(sum(10, 30));
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

}
