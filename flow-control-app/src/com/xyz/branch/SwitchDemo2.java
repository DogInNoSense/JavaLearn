package com.xyz.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        // 目标:学会使用switch分支结构 适合做值匹配
        String weekday = "周一";
        switch (weekday) {
            case "周一":
                System.out.println("周一");
                break;
            case "周二":
                System.out.println("周二");
                break;
            case "周三":
                System.out.println("周三");
                break;
            case "周四":
                System.out.println("周四");
                break;
            case "周五":
                System.out.println("周五");
                break;

            default:
                System.out.println("数据有误!");
        }
    }
}
