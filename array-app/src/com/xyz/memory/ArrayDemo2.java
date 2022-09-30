package com.xyz.memory;

public class ArrayDemo2 {
    public static void main(String[] args) {
        // 两个数组变量指向同一个数组对象
        int arr1[] = {11, 22, 33};
        //把数组arr1赋值给int 类型 arr2
        int arr2[] = arr1;

        System.out.println(arr1);
        System.out.println(arr2);// 地址一样

        arr2[1] = 99;
        System.out.println(arr1[1]);
        System.out.println(arr2[1]);
    }
}
