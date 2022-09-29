package com.xyz.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标:学会使用自增自减运算 ++ --
        int a = 10;
        a++; // a = a + 1
        System.out.println(a);

        int b = 10;
        b--;
        System.out.println(b);
        // 在表达式中或者不是单独操作的情况 ++ -- 在变量前后存在区别
        // ++ --在变量前面,先+1 -1再使用
        int c = 10;
        int rs = c++;
        System.out.println(rs);
        int i = 10;
        int j = ++i;
        System.out.println(j);

        int m = 10;
        int n = m++;
        System.out.println(n);
        System.out.println(m);

        System.out.println("----------------------拓展案例---------------------");
        int k = 3;
        int p = 5;
        int xs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(k);//4
        System.out.println(p);//4
        System.out.println(xs);//9

    }
}
