package com.xyz.loop;

public class WhileDemo4 {
    public static void main(String[] args) {
        double peakHeight = 8948860;//厘米
        double paperThickness = 0.1;//纸张厚度0.1
        //折叠多少起可以折成珠穆朗玛峰的高度
        int count = 0;
//        while (paperThickness < peakHeight) {
//            paperThickness *= 2;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println("纸张的最终厚度:" + paperThickness);

        for (; paperThickness < peakHeight; ) {
            paperThickness *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println("纸张的最终厚度:" + paperThickness);
    }
}
