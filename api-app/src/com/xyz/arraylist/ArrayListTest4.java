package com.xyz.arraylist;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        // 学习遍历并删除元素的正确方案
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        // 把低于80分的成绩从集合去掉
//        for (int i = 0; i < scores.size(); i++) {
//            int score = scores.get(i);// 根据索引提取数据
//            if (score < 80) {
//                scores.remove(i);
//                i--;// 删除成功后需回退一步
//            }
//        }
        System.out.println(scores);
        // 从后面倒着遍历删除就可以
        for (int i = scores.size() - 1; i >= 0; i--) {
            int score = scores.get(i);// 根据索引提取数据
            if (score < 80) {
                scores.remove(i);
            }

        }
        System.out.println(scores);
    }
}
