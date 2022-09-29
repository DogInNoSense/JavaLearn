package com.xyz.demo;

public class Test5 {
    public static void main(String[] args) {
        // 冒泡排序
        // 1.定义一个数组存储数据
        int arr[] = {5, 2, 4, 1};
        // 2.定义一个循环控制比较的轮数
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
