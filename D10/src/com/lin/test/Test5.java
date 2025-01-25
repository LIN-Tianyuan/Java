package com.lin.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        // 1. Create a collection
        ArrayList<Student> list = new ArrayList<>();
        // Length 0
        // 2. Keyboard student information and adding it to the collection
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("Please enter the student's name: ");
            String name = sc.next();
            System.out.println("Please enter the age of the student: ");
            int age = sc.nextInt();

            // Assign name and age to the student object
            s.setName(name);
            s.setAge(age);

            // Add a student object to a collection
            list.add(s);
        }
        // 3. Iteration
        for (int i = 0; i < list.size(); i++) {
            // i index list.get(i) element/student object
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
