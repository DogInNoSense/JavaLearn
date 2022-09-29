package com.xyz.loop;

public class BreakAndContinueDemo10 {
    public static void main(String[] args) {
        // 理解break 和 continue的作用
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;//跳出当前的循环
            }
            System.out.println("快乐的洗碗");
        }
        System.out.println("-------------------------");
        // continue 跳出当前循环的执行 进入循环的下一次

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("快乐的洗碗" + i);
        }

//        if (true) {
//            break;//只能用在循环或swit中
//            System.out.println("xyz");
//        }
    }
}
