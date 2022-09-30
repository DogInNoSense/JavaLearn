package com.xyz.attention;

public class Test {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33};
//        System.out.println(arr[3]);//数组越界异常

        // 如果数组变量中没有存取数组的地址,而是null,在访问数组信息时会出现NullPointerException
        arr = null;
        System.out.println(arr);
//        System.out.println(arr.length);
    }
}
