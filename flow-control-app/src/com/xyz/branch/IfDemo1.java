package com.xyz.branch;

import com.sun.security.jgss.GSSUtil;

public class IfDemo1 {
    public static void main(String[] args) {
        // 需求 心跳 60-100 正常的,否则系统提醒进一步检查
        // 格式1
        int heartBeat = 90;
        if (heartBeat < 60 || heartBeat > 100) {
            System.out.println("您的心跳不正常,需要进一步检查");
        } else {
            System.out.println("检查结束!");
        }
        //格式2
        double money = 5999;
        if (money >= 1314) {
            System.out.println("您当前发送红包成功");
        } else {
            System.out.println("发送失败");
        }

        // 格式3
        //绩效系统
        int score = 99;
        if (score >= 0 && score < 60) {
            System.out.println("您本月的绩效是C");
        } else if (score >= 60 && score < 80) {
            System.out.println("您本月绩效为A");
        } else if (score >= 80 && score <= 100) {
            System.out.println("您本月绩效为A");
        } else {
            System.out.println("您输入的数字不合法!");
        }
    }
}
