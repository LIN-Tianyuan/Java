package com.lin.test;

import java.util.ArrayList;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // 1. Create a collection
        ArrayList<Student> list = new ArrayList<>();

        // 2. Create Student Objects
        Student s1 = new Student("tom",23);
        Student s2 = new Student("luna",24);
        Student s3 = new Student("alex",25);

        // 3. Add Elements
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 4. Iterate over the collection
        for (int i = 0; i < list.size(); i++) {
            // i index list.get(i) element/student object
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
