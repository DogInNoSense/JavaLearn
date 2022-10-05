package com.xyz.constructor;

public class Car {
    String name;
    double price;


    // 无参构造器 (任何类写出来自带一个无参构造器,但是如果定义了一个有参构造器,无参构造器必须自己写一个)


    public Car() {
        System.out.println("===无参数构造器被调用了==");

    }

    public Car(String n, double p) {
        System.out.println("===无参数构造器被调用了==");
        name = n;
        price = p;
    }
}
