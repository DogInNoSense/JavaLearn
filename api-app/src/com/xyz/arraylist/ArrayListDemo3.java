package com.xyz.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("mysql");
        list.add("mybatis");
        list.add("html");
        // 1.获取某个索引位置处的元素值
        String e = list.get(3);
        System.out.println(e);
        // 2.获取集合的大小(元素个数)
        System.out.println(list.size());
        // 3.集合的遍历
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//        System.out.println(list.get(4));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 4.删除某个索引位置处的元素值,并返回被删除的元素值
        System.out.println(list);
        String e2 = list.remove(2);
        System.out.println(e2);
        System.out.println(list);
        // 5.直接删除元素值 删除成功返回true 删除失败返回false
        System.out.println(list.remove("mybatis"));
        System.out.println(list);
        list.remove("java");
        System.out.println(list);// 只会删除第一次出现的java

        // 6.修改某个索引位置的处的元素值
        String e3 = list.set(0, "xyz");// 返回被修改的元素
        System.out.println(e3);
        System.out.println(list);

    }
}
