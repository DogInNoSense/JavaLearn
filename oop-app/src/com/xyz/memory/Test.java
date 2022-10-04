package com.xyz.memory;

import com.xyz.createobject.Student;

public class Test {
    public static void main(String[] args) {
        // 创建学生对象
        Student1 s1 = new Student1();
        s1.name = "小明";
        s1.sex = '男';
        s1.hobby = "睡觉,游戏,学习";
        s1.study();
        // 把s1变量赋值给一个学生类型的变量s2
        Student1 s2 = s1;
        System.out.println(s2);
        System.out.println(s1);

        s2.hobby = "爱提问";
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s1.hobby);
        s2.study();
    }
}
