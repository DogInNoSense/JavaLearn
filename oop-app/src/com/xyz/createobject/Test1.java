package com.xyz.createobject;

public class Test1 {
    public static void main(String[] args) {
    // 创建汽车对象
        Car c = new Car();
        c.name = "宝马";
        c.price = 38.9;
        System.out.println(c.name);
        System.out.println(c.price);

        System.out.println("------------------");
        Car c2 = new Car();
        c2.name = "奔驰";
        c2.price = 39.9;
        System.out.println(c2.name);
        c2.start();
        c2.run();
    }
}

