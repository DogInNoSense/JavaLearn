package com.xyz.param;

public class Test3 {
    public static void main(String[] args) {
        // 打印任意整型数组的内容
        int ages[] = {10, 20, 30, 40};
        printArray(ages);
//        System.out.println();
        System.out.println("--------------------------------");
        int numbers[] = {1, 2, 3, 9, 10};
        printArray(numbers);
        int empty[] = {};
        printArray(empty);
    }


    public static void printArray(int arr[]) {
        System.out.print("[");
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
//            if (i < arr.length - 1) {
//                System.out.print(arr[i] + ",");
//            } else {
//                System.out.print(arr[i]);
//            }
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            }
        }

//        System.out.print("]");
        System.out.println("]");
    }
}
