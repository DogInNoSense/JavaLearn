package com.xyz.javabean;

public class Test {
    public static void main(String[] args) {
        // 1.无参构造器创建对象封装一个用户信息
        User u1 = new User();
        u1.setName("xyz");
        u1.setHeight(175);
        u1.setSalary(1000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        // 2.有参构造器创建对象封装一个用户信息
        User u2 = new User("zyx",199,2000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
