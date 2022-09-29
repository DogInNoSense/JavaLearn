package com.xyz.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        // 掌握使用基本数据定义不同的变量
        // 1.byte字节型 占1个字节 表示 -128 ~ 127
        byte number = 98;
        System.out.println(number);

        // 2.short短整型 占2个字节
        short money = 30000;

        // 3.int类型 默认的类型 占4个字节(默认使用的类型)
        int it = 232442442;

        // 4.long长整数 占8个字节
        long lg = 1332323223;
        // 注意:随便写一个整数默认是int类型,如果希望随便写一个整数字面量当成long类型,需要在其后面加L/l
        long lg2 = 1232324324342354354L;

        // 5.浮点型(小数)
        // float单精度 占4个字节
        // 随便写一个小数默认是double类型的,如果希望随便写一个小数字面量是float类型的 需要
        float score = 98.5F;

        // 6.double双精度 占8个字节

        double score2 = 999.99;

        // 7.字符类型 char 占2个字节
        char ch = 'a';
        char ch2 = '中';
        // char ch3='中国'//报错

        // 8.布尔类型 boolean 占1个字节
        boolean rs = true;
        boolean rs2 = false;

        System.out.println("----------------------引用数据类型-----------------------");
        String name = "西门吹雪";
        System.out.println(name);
    }
}
