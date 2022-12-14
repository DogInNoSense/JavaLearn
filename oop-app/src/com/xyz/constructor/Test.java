package com.xyz.constructor;

public class Test {
    public static void main(String[] args) {
        // 通过调用构造器得到对象
        Car c = new Car();
        c.name = "宝马";
        c.price = 38.9;
        System.out.println(c); // 返回这个对象的地址
        System.out.println(c.name);
        System.out.println(c.price);

        // 调用有参构造器
        Car c2 = new Car("奔驰",39.8);
        System.out.println(c2); // 返回这个对象的地址
        System.out.println(c2.name);
        System.out.println(c2.price);

    }
}
