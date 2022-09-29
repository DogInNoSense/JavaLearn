package com.xyz.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        //1.整数
        System.out.println(666);

        //2.小数
        System.out.println(99.5);

        //3.字符 必须用单引号,有且只能有一个字符
        System.out.println('a');
        System.out.println(' ');
        // 特殊的字符 \n代表换行 \t代表一个tab
        System.out.println('中');
        System.out.println('\n');
        System.out.println('\t');
        System.out.println('国');

        //4.字符串,必须要用双引号围起来,里面的内容其实可以随意
        System.out.println("我爱你中国");
        System.out.println("");
        System.out.println("我");

        //5.布尔值: 只有两个值 true false
        System.out.println(true);
        System.out.println(false);
    }
}
