package com.xyz.create;

public class ArrayAttentionDemo3 {
    public static void main(String[] args) {
        // 理解数组的注意事项
//        int[] ages = {11,23,45};
        int ages[] = {11, 23, 45};
        System.out.println(ages[1]);
        // 两种书写方式

        // 什么类型的数组只能存放什么类型的元素

//        String[] names = {"xyz","zyx",23};// 错误的

        // 数组一旦定义出来之后,类型和长度就固定了
        int[] ages2 = {11, 23, 35};
//        System.out.println(ages2[3]); // 错误
    }
}
