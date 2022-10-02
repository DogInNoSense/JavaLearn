package com.xyz.demo;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String code = createCode(6);
        System.out.println("随机验证码是:" + code);
    }

    // 1.定义一个方法返回一个随机验证码 可能是英文大小写字母 数字
    public static String createCode(int n) {
        // 2.定义一个for循环 循环n次 依次生成随机字符
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);// 0 1 2
            switch (type) {
                case 0:
                    // 大写字母(A 65 Z 65+25) (0 - 25)+65
                    char ch = (char) (r.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
                    // 小写字符
                    // 大写字母(a 97 z 97+25) (0 - 25)+97
                    char ch1 = (char) (r.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    // 数字字符
                    code += r.nextInt(10);
                    break;

            }
        }
        return code;
    }
}
