package com.xyz.demo;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        // 1.定义商品类,用于创建商品对象
        // 2.定义购物车对象,使用一个商品类型的数组对象表示
        Goods[] shopCar = new Goods[100];//[null,null,..]
        // 3.搭建操作架构
        while (true) {
            System.out.println("请您选择如下命令进行操作:");
            System.out.println("添加商品到购物车:add");
            System.out.println("查询商品:query");
            System.out.println("修改商品购买数量:update");
            System.out.println("结算购买商品金额:pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请您输入命令");
            String command = sc.next();
            switch (command) {
                case "add":
                    // 添加商品到购物车
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    // 查询购物车展示
                    queryGoods(shopCar);
                    break;

                case "update":
                    // 修改商品的数量
                    updateGoods(shopCar, sc);
                case "pay":
                    // 结算金额
                    pay(shopCar);
                    break;
                default:
                    System.out.println("没该功能");
                    break;
            }
        }
    }

    public static void pay(Goods[] shopCar) {
        queryGoods(shopCar);
        // 1.定义一个求和变量累加金额
        double money = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                money += g.price * g.buyNumber;
            } else {
                break;
            }
        }
        System.out.println("金额一共是" + money + "元");
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        // 让用户输入要修改商品的id,根据id查询出要修改的商品对象
        while (true) {
            System.out.println("请您输入要修改的商品的id");
            int id = sc.nextInt();
            Goods g = getGoodsById(shopCar, id);
            if (g == null) {
                // 没有该商品
                System.out.println("没有该商品");
            } else {
                // 存在该商品,可以修改
                System.out.println("请您输入:" + g.name + "商品最新购买数量:");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }

    }

    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                if (g.id == id) {
                    return g;
                }
            } else {
                return null;// 找完了已存在的商品但是没找到
            }

        }
        return null;// 找完了100个商品但是没有找到
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("===============================查询购物车信息如下================================");
        System.out.println("编号\t\t名称\t\t\t价格\t\t\t购买数量");
        // shopCar = [g1,g2,g3,null]

        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                // 显示这个商品对象
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t\t" + g.buyNumber);
            } else {
                // 遍历结束
                break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
        // 1.录入用户输入的购买的商品信息
        System.out.println("请您输入购买商品的编号");
        int id = sc.nextInt();
        System.out.println("请您输入商品名称");
        String name = sc.next();
        System.out.println("请您输入购买商品的数量");
        int buyNumber = sc.nextInt();
        System.out.println("请您输入购买商品的价格:");
        double price = sc.nextDouble();

        // 2.把这个购买商品的信息封装成一个商品对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;
        // 3.把这个给商品对象添加到购物车数组中去

        // shopCar = [null,null,...]
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;// 存放的地址
                break;// 商品成功存入
            }
        }
        System.out.println("您的商品:" + g.name + "添加到购物车完成");

    }
}
