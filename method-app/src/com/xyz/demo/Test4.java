package com.xyz.demo;

public class Test4 {
    public static void main(String[] args) {
        // 理解方法的内存运行机制
        study();
    }

    public static void eat() {
        System.out.println("eat");
    }

    public static void sleep() {
        System.out.println("sleep");
    }

    public static void study() {
        eat();
        System.out.println("study");
        sleep();
    }
}
