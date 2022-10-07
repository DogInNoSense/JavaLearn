package com.xyz.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    // 创建Arraylist对象 代表集合容器 往里面添加元素
    // 1.创建Arraylist集合的对象
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        // 2.添加数据
        list.add("java");
        list.add("MySQL");
        list.add(123);
        list.add('中');
        System.out.println(list);

        // 3.给指定索引位置插入元素
        list.add(1, "xyz");
        System.out.println(list);
    }

}
