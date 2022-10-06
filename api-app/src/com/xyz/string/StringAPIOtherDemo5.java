package com.xyz.string;

public class StringAPIOtherDemo5 {
    public static void main(String[] args) {
        // 1.public int length(): 获取字符串的长度
        String name = "我爱你中国love";
        System.out.println(name.length());
        // 2.获取某个索引位置的字符
        char c = name.charAt(1);
        System.out.println(c);
        // 3.遍历 每个字符
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        // 4.把字符串转成字符数组
        char chars[] = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.println(ch);
        }
//        System.out.println(chars);
        // 5.截取内容
        String name2 = "java yyds";
        System.out.println(name2.substring(0, 5));
        System.out.println(name2.substring(5));

        // 6.替换字符串
        String name3 = "xyz yyds";
        String s3 = name3.replace("xyz", "***");
        System.out.println(s3);
        // 7.判断是不是包含某段字符串
        System.out.println(name3.contains("xyz"));
        // 8.判断是不是以某段字符串开始
        System.out.println(name3.startsWith("xyz"));
        // 9.分割字符串
        String name4 = "王宝强,贾乃亮,andy";
        String names[] = name4.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
