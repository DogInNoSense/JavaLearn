package com.xyz.demo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 数据加密
        // 1.定义一个动态数组 存入需要加密的数据
        System.out.println("请您输入需要加密的数据个数");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];

        // 2.录入要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入准备加密的第" + (i + 1) + "个数字:");
            int number = sc.nextInt();
            arr[i] = number;
        }
        // 3.打印数组内容
        printArray(arr);

        // 4.对数组数据进行加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5);
        }
        // 4.对数组加密的数字进行翻转
        reverseArray(arr);
        // 5.输出加密翻转后的数组
        printArray(arr);

    }

    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    // 翻转数组
    public static void reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp;
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}
