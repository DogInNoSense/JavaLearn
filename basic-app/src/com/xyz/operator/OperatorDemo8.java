package com.xyz.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        // 目标: 学会使用三元运算符,理解其流程
        double score = 68;
        String rs = score >= 98 ? "考试通过" : "考试不通过";
        System.out.println(rs);

        // 需求:需要从2个整数中找出较大值
        int a = 10;
        int b = 2000;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
