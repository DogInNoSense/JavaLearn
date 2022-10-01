package com.xyz.returndemo;

public class ReturnDemo {
    public static void main(String[] args) {
        // return 跳出并立即结束所在方法的执行
        chu(1, 1);
    }

    public static void chu(int a, int b) {
        if (b == 0) {
            System.out.println("输入数据有误");
            return;
        } else {
            int c = a / b;
            System.out.println(c);
        }

    }
}
