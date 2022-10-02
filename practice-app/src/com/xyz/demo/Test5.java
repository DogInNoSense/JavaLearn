package com.xyz.demo;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 1.定义一个动态初始化的数组,用于后期录入6个评委的分数
        int scores[] = new int[6];
        //2.录入6个评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请您输入第" + (i + 1) + "个评委的打分");
            int score = sc.nextInt();

            scores[i] = score;
        }
        System.out.println("您输入的所有成绩为:");
        printArray(scores);
        // 遍历数组的每个数据 找出最大值 最小值 总分
        int max = scores[0], min = scores[0], sum = scores[0];
        for (int i = 1; i < scores.length; i++) {
            sum = sum + scores[i];
            if (scores[i] > max) {
                max = scores[i];
            } else if (scores[i] < min) {
                min = scores[i];
            }

        }
        System.out.println("最大值是:" + max + "\t最小值是:" + min + "\t总分为:" + (sum - (max + min)) / (scores.length - 2));
    }

    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
