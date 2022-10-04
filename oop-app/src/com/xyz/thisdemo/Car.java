package com.xyz.thisdemo;

public class Car {
    String name;
    double price;

    // 无参构造器


    public Car() {
        System.out.println("无参数构造器中的this:" + this);

    }

    public void run() {
        System.out.println("方法中的this:" + this);
    }


    public Car(String name, double price) {
        this.name = name;// 为对象name赋值
        this.price = price;
    }

    public void goWith(String name) {
        System.out.println(this.name + "正在和" + name + "比赛");
    }
}
