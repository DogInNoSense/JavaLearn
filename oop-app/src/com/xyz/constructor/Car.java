package com.xyz.constructor;

public class Car {
    String name;
    double price;


    // 无参构造器


    public Car() {
        System.out.println("===无参数构造器被调用了==");

    }

    public Car(String n, double p) {
        System.out.println("===无参数构造器被调用了==");
        name = n;
        price = p;
    }
}
