package com.xyz.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest6 {
    public static void main(String[] args) {
        // 1.定义学生类
        // 2.创建集合存储学生对象,创建学生对象封装学生信息
        // 把学生对象添加到集合中去
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("20180302", "xyz1", 23, "护理一班"));
        students.add(new Student("20180303", "xyz2", 23, "推拿二班"));
        students.add(new Student("20180304", "xyz3", 23, "中药三班"));
        students.add(new Student("20180305", "xyz4", 23, "神经四班"));
        // 3.遍历这些学生信息展示
        System.out.println("学号\t\t姓名\t年龄\t班级\t");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getStudyNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassName());

        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入学号查询学生对象:");
            String studyNumber = sc.next();
            // 5.调用方法查询
            Student s = getStudentById(students, studyNumber);
            // 6.判断s中是否存在查询的学生对象地址
            if (s == null) {
                System.out.println("没有查询到!");
            } else {
                System.out.println("查询的信息如下:");
                System.out.println(s.getStudyNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getClassName());
            }
        }

    }

    /**
     * 根据学生的学号查询学生对象返回
     *
     * @param students    存储全部学生对象的集合
     * @param studyNumber 搜索的学生的学号
     * @return 返回学生的对象或者null
     */
    // 4.定义方法按照学号的搜索功能
    public static Student getStudentById(ArrayList<Student> students, String studyNumber) {
        // 1.遍历全部学生对象
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudyNumber().equals(studyNumber)) {
                return s;
            }
        }
        // 查不到这个学生对象
        return null;
    }
}
