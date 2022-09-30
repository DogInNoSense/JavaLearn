package com.xyz.memory;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(a);

        int arr[] = {11, 22, 33};
        System.out.println(arr);

        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
