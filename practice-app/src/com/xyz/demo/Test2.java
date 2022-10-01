package com.xyz.demo;

//public class Test2 {
////     找出 101-200之间的素数输出:
////     素数:除了1和他本身之外不能被其他数整除
//
//    public static void main(String[] args) {
//
//        int count = 0;
//        for (int i = 101; i < 201; i++) {
//            // 信号位:标记
//
//            boolean flag = true; // 一开始认为当前数据是素数
//            for (int j = 2; j < i / 2; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                count++;
//                System.out.print(i + "\t");
//            }
//        }
//        System.out.println();
//        System.out.println("一共" + count + "个素数");
//    }
//
//
//}

public class Test2 {
    public static void main(String[] args) {
        // 另外一种复杂方式(by.xyz..)
        int sum = 0;
        for (int i = 101; i < 201; i++) {
            int count = 0;// 记录内层循环次数
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue;
                }
                count++;

            }
            if (count == i / 2 - 2) {
                sum++;
                System.out.print(i + "\t");
            }


        }
        System.out.println();
        System.out.println("一共" + sum + "个素数");
    }


}



