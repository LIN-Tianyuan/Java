package com.lin.test4;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;


    // If we don't write any constructors ourselves
    // then the VM adds a null constructor for us
    /* public Student(){
        System.out.println(“See if I executed it?”) ;
    }*/

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
