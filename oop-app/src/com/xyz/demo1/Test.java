package com.xyz.demo1;

public class Test {
    public static void main(String[] args) {
        // 1.设计电影类
        // 2.创建3个电影对象,封装电影信息

        // 3.定义一个电影类型的数组 存储3部电影对象
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖", 9.7, "吴京");
        movies[1] = new Movie("我和我的父辈", 9.7, "吴京");
        movies[2] = new Movie("星际穿越", 9.7, "吴京");
        // 遍历数组中的每个电影对象,然后获得他的信息展示出来
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i]; // 电影对象地址赋值给m
//            System.out.println(m);// 地址
            System.out.println("电影名称:" + m.getName());
            System.out.println("得分:" + m.getScore());
            System.out.println("主演:" + m.getActor());

        }
    }
}
