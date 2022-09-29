package com.xyz.operator;

public class OperatorTest2 {
    public static void main(String[] args) {
        // 拆分三位数 把个位 十位 百位 分别输出
        int data = 589;

        // 1.个位
        int ge = data % 10;
        int shi = (data / 10) % 10;
        int bai = data / 100;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
