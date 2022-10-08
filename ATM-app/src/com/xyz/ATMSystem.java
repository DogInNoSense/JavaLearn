package com.xyz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM系统的入口
 */
public class ATMSystem {
    public static void main(String[] args) {
        // 1.定义账户类
        // 2.定义一个集合容器,负责以后存储全部的账户对象,进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        // 3.展示系统的首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================ATM系统================");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            System.out.println("请您选择操作:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 用户登录操作
                    break;
                case 2:
                    // 用户账户开户
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在");
            }
        }

    }

    /**
     * 用户开户功能的实现
     *
     * @param accounts 接受的账户集合
     */

    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("==================系统开户操作==================");
        // 1.创建一个账户对象,用于后期封装账户信息
        Account account = new Account();

        // 2.录入当前这个账户的信息,注入到账户对象中去
        System.out.println("请您输入账户用户名:");

        String userName = sc.next();
        account.setUserName(userName);


        while (true) {
            System.out.println("请您输入账户密码:");
            String passWord = sc.next();
            System.out.println("请您输入确认密码:");
            String okPassWord = sc.next();
            if (passWord.equals(okPassWord)) {
                // 密码认证通过,可以注入给账户对象
                account.setPassWord(okPassWord);
                break;// 密码录入成功
            } else {
                System.out.println("对不起,您输入的2次密码不一致,请重新确认~~");

            }
        }


        System.out.println("请您输入账户当次限额");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 为账户随机一个八位且与其他账户的卡号不重复的号码(独立功能)

        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        // 3.把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜您," + userName + "账户开户成功,您的卡号是:" + cardId + "请妥善保管!");
    }

    /**
     * 为账户生成8位与其他用户卡号不同的号码
     */

    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            // 1.先生成8位数字
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);// 0-9
            }

            // 2.判断这个8位卡号是否与其他账户的卡号重复了
            // 根据这个卡号去查询账户的对象
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null) {
                // 说明cardId此时没有重复 这个卡号就是一个新卡号了
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询一个账户对象出来
     *
     * @param cardId   卡号
     * @param accounts 账户
     * @return 账户对象|null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;// 没有此账号
    }


}
