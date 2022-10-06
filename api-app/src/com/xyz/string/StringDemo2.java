package com.xyz.string;

public class StringDemo2 {
    public static void main(String[] args) {
        // 1.方式1
        String name = "我爱你中国";
        System.out.println(name);

        // 2.方式2
        String s1 = new String();
        System.out.println(s1);

        // 3.方式3
        String s3 = new String("你是汉奸");
        System.out.println(s3);
        // 字符数组转字符串
        char[] chars = {'a', 'b', 'c', 'd'};
        String s4 = new String(chars);
        System.out.println(s4);

        // 字节数组转字符串
        byte[] bytes = {97, 98, 99, 66, 67};
        String s5 = new String(bytes);
        System.out.println(s5);
        System.out.println("----------------------------------");

        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2);

        char[] chars1 = {'a', 'b', 'c'};
        String ss3 = new String(chars1);
        String ss4 = new String(chars1);
        System.out.println(ss3 == ss4); // false

    }
}
