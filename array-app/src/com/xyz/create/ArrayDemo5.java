package com.xyz.create;

public class ArrayDemo5 {
    public static void main(String[] args) {
        // 1.整型数组的默认值 0
        int[] arr = new int[10];
        System.out.println(arr[0]);

        // 2.字符型数组的元素默认值
        char[] chars = new char[100];
        System.out.println(chars[0]);
        System.out.println((int) chars[0]);// 0

        // 3.浮点型数组的元素默认值是  0.0
        double[] scores = new double[90];
        System.out.println(scores[0]);

        // 4.布尔类型的数组 默认值 false
        boolean[] booleans = new boolean[100];
        System.out.println(booleans[0]);

        // 5.引用类型的数组 默认值是null
        String names[] = new String[10];
        System.out.println(names[0]);
    }
}
