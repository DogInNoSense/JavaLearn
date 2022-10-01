package com.xyz.param;

public class Test5 {
    public static void main(String[] args) {
        // 比较任意两个整型数组的内容是否一样,一样返回true
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 2, 3, 4};
        System.out.println(compare(arr1, arr2));

    }

    public static boolean compare(int arr1[], int arr2[]) {
        // 判断两个数组的内容是否一样
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }
}
