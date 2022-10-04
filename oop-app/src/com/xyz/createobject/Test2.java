package com.xyz.createobject;

public class Test2 {
    public static void main(String[] args) {
        // 1.类名首字母建议大写,满足"驼峰模式",不能用关键字,且有意义

        // 2.一个java文件中可以定义多个class类,但只能一个是public修饰(实际开发中还是建议一个java文件只定义一个类)

        // 3.一般无需指定初始化值
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.flag);
    }
}
