package com.xyz.operator;

public class OperatorDemo7 {
    public static void main(String[] args) {
        // 目标:学会使用逻辑运算符 并能够选择合适的逻辑运算符解决问题
        double size = 9.8;
        double storage = 16;
        //
        System.out.println(size >= 6.95 & storage >= 8);


        System.out.println(size >= 6.95 | storage >= 8);


        System.out.println(!true);
        System.out.println(!false);

        //逻辑异或:必须两个不同结果才是true
        System.out.println(false ^ true);//true
        System.out.println(true ^ false);//true
        System.out.println(true ^ true);//false

        System.out.println("------------&& & | || 的区别");
        int a = 10;
        int b = 20;

        System.out.println(a > 100 && ++b > 10);//&&执行效率更高 &两边都要执行
        System.out.println(b);//20

        int i = 10;
        int j = 20;
        System.out.println(i > 2 || ++j > 10);
        System.out.println(j);//20
    }
}
