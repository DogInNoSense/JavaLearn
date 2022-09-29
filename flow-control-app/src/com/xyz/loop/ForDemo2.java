package com.xyz.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        // 水仙花数
        //求水仙花数的个数
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = (i / 10) % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花个数是:" + count);
    }
}
