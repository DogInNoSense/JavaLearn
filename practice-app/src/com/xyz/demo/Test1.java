package com.xyz.demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test1 {
    // 完成买飞机票的价格计算
    // 1.让用户输入机票原价,月份,仓位类型
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入机票原价");
        double money = sc.nextDouble();
        System.out.println("请您输入机票的月份(1-12):");
        int month = sc.nextInt();
        System.out.println("请您选择仓位类型:");
        String type = sc.next();
        // 调用方法,统计结果
        System.out.println("机票优惠后的价格是:" + calc(money, month, type));

    }

    public static double calc(double money, int month, String type) {
        // 判断用户选择的信息情况
        if (month >= 5 && month <= 10) {
            // 旺季
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的仓位类型有误!");
                    money = -1; //表示无法计算价格
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (type) {
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的仓位类型有误!");
                    money = -1; //表示无法计算价格
            }
        } else {
            System.out.println("您输入的月份有误");
            return -1;
        }
        return money;
    }

}
