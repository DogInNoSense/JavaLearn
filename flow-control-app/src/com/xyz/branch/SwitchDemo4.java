package com.xyz.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        // 输入月份可以展示月份的天数
        int month = 2;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月是31天");
                break;
            case 2:
                System.out.println(month + "月闰年29天 非闰年28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月是30天");
                break;


        }
    }
}
