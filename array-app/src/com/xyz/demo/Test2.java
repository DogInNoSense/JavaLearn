package com.xyz.demo;

public class Test2 {
    public static void main(String[] args) {
        int faceScore[] = {15, 9000, 10000, 20000, 9500, -5};
        int max = faceScore[0];
        for (int i = 1; i < faceScore.length; i++) {
            if (faceScore[i] > max) {
                max = faceScore[i];
            }
        }
        System.out.println(max);
    }
}
