package com.xyz.javabean;

public class User {
    // 1.成员变量建议使用private私有
    private String name;
    private double height;
    private double salary;

    // 3.要求提供无参构造器 有参构造器是可选

    public User() {
    }

    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    // 2.必须为成员变量提供成套的setter和getter方法


    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
