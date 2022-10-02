package com.xyz.demo;

public class Test4 {
    public static void main(String[] args) {
        // 把一个数组复制到另一个数组中
        int arr1[] = {11, 22, 33, 44};
        int arr2[] = new int[arr1.length];
//        arr2 = arr1;
//        printArray(arr2);
        copy(arr1, arr2);
        System.out.println(arr1);// 查看地址
        System.out.println(arr2);
        printArray(arr1);
        printArray(arr2);

    }

    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }

    public static void copy(int arr1[], int arr2[]) {
        // 正式完成元素的复制
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
