package com.xyz.create;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 学会方法的定义格式,理解其调用和执行流程
        int rs = add(100, 200);
        System.out.println(rs);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
