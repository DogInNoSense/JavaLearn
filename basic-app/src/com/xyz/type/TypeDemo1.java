package com.xyz.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 理解自动类型转换
        byte a = 20;
        int b = a;// 发生了自动类型转换
        System.out.println(a);
        System.out.println(b);

        // 类型范围小的变量可以直接赋值给类型范围大的变量
    }
}
