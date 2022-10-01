package com.xyz.overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 识别方法重载的形式,并理解其调用流程,并知道方法重载的好处
        fire();
        fire("荷兰");
        fire("台湾", 1000);
        // 不会出现冲突,可读性好,通过形参区别
    }

    public static void fire() {
        System.out.println("默认发射一枚武器给米国~~~~");
    }

    public static void fire(String location) {
        System.out.println("默认发射一枚武器给" + location + "米国" + "~~~~");
    }

    public static void fire(String location, int number) {
        System.out.println("默认发射" + number + "枚武器给" + location + "米国" + "~~~~");
    }
}
