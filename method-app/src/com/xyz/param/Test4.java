package com.xyz.param;

public class Test4 {
    public static void main(String[] args) {
        // 从整型数组中查询某个数据的索引返回,不存在该数据返回-1
        int arr[] = {11, 22, 33, 44, 55, 66};
        int index = searchIndex(arr,66);
        System.out.println(index);

    }

    // 定义一个方法 返回值:整型
    public static int searchIndex(int arr[], int data) {
        // 开始找这个数据的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;// 没有此元素
    }

}

