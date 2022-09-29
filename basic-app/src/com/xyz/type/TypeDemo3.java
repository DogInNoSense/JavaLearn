package com.xyz.type;

public class TypeDemo3 {
    public static void main(String[] args) {
        // 理解强制类型转换并使用
        int a = 20;
//        byte b = a;//大范围的变量不能直接赋值给小范围的变量
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);
        // 可以强行将类型范围大的变量,数据赋值给类型范围小的变量

        int i = 1500;
        byte j = (byte) i;
        System.out.println(i);
        System.out.println(j);
        // 强制类型转换可能会造成数据丢失或溢出


        double score = 99.5;
        int it = (int) score;
        System.out.println(it);
    }
}
