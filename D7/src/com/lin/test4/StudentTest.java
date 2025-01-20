package com.lin.test4;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // Create the object
        // Null-parameter construction of the call
        // Reason for reporting error:
        // will call the null-parameter construction of Student
        // Student s = new Student();

        Student ss = new Student("zhangsan",23);
        System.out.println(ss.getName());
        System.out.println(ss.getAge());


    }
}
