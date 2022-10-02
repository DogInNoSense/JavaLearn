package com.xyz.demo;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        // 双色球系统 业务分析 随机生成一组中奖号码
        int luckNumbers[] = createLuckNumber();
//        printArray(luckNumbers);
        // 调用一个方法让用户输入7个号码,作为用户选号
        int userNumbers[] = userInputNumber();
        System.out.println("您输入的所有号码为:");
        printArray(userNumbers);
        // 判断中奖情况
        judge(luckNumbers, userNumbers);


    }

    public static void judge(int luckNumbers[], int userNumbers[]) {
        // 判断是否中奖了
        // luckNumbers = [12,23,8,26,15,32,9]
        // userNumbers = [23,13,18,6,8,33,10]
        // 定义2个变量分别存储红球命中和蓝球命中的个数
        int redHitNumbers = 0;
        int blueHitNumbers = 0;
        // 判断红球命中了几个
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckNumbers.length - 1; j++) {
                if (userNumbers[i] == luckNumbers[j]) {
                    redHitNumbers++;
                    break;
                }
            }
        }
        // 判断蓝球是否命中
        blueHitNumbers = luckNumbers[6] == userNumbers[6] ? 1 : 0;
        System.out.println("中奖号码是:");
        printArray(luckNumbers);
        System.out.println("您命中了几个红球:" + redHitNumbers);
        System.out.println("您命中了几个蓝球:" + blueHitNumbers);


        // 判断几等奖
        if (blueHitNumbers == 1 && redHitNumbers < 3) {
            System.out.println("恭喜您中奖5元");
        } else if (blueHitNumbers == 1 && redHitNumbers == 3 || blueHitNumbers == 0 && redHitNumbers == 4) {
            System.out.println("恭喜您中了10元");
        } else if (blueHitNumbers == 1 && redHitNumbers == 4 || blueHitNumbers == 0 && redHitNumbers == 5) {
            System.out.println("恭喜您中了200元");

        } else if (blueHitNumbers == 1 && redHitNumbers == 5) {
            System.out.println("恭喜您中了300元");
        } else if (blueHitNumbers == 0 && redHitNumbers == 6) {
            System.out.println("恭喜您中了500万");
        } else if (blueHitNumbers == 1 && redHitNumbers == 6) {
            System.out.println("恭喜您中了1000万");

        } else {
            System.out.println("很遗憾没有中奖");
        }
    }

    public static int[] userInputNumber() {
        // a.定义一个数组存储7个号码
        int numbers[] = new int[7];
        // b.让用户录入6个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请您输入第" + (i + 1) + "个红球号码(1-33)");
            int data = sc.nextInt();
            // c.把当前录入的数据存入到数组中去
            numbers[i] = data;

        }
        // d.单独录入一个蓝球号码
        System.out.println("请输入如一个蓝球号码(1-16):");
        numbers[6] = sc.nextInt();
        return numbers;
    }

    // 生成中奖号码
    public static int[] createLuckNumber() {
        // a.定义一个动态初始化的数组,存储7个数字
        int numbers[] = new int[7];
        // b.遍历数组 为每个位置生成对应的号码(遍历6个位置,生成6个不重复的红球号码,范围是1-33)
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            // 为当前位置找一个不重复的数字
            while (true) {
                int data = r.nextInt(33) + 1; // 1-33 ==> (0 - 32) + 1
                // c.注意:必须判断当前随机的这个号码之前是否出现过,出现过要重新随机一个,直到不重复为止,才可以从存入数组中去
                boolean flag = true;// 默认没有重复
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data) {
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    numbers[i] = data;
                    break;
                }
            }

        }
        // d.为第七个位置生成一个1-16的号码作为蓝球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }

    // 打印数组
    public static void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }


}
