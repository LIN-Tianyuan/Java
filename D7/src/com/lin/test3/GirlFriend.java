package com.lin.test3;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class GirlFriend {
    // Properties
    private String name;
    private int age;
    private String gender;


    // Provide get and set methods for each privatized member variable.
    // set method: assigns a value to a member variable.
    // get method: provide the value of the member variable externally.

    // Role: Assigns a value to the member variable name.
    public void setName(String name){
        // Local variables represent the data passed by the method called in the test class.
        // The left side of the equal sign: the name of the member position.
        this.name = name;
    }

    // Role: Provides the name attribute externally to the
    public String getName(){
        return name;
    }


    // age
    // setAge: assigns a value to the member variable age
    // getAge: provides the value of the member variable age to the public.
    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("Illegal parameters");
        }
    }

    public int getAge(){
        return age;
    }


    // gender
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }


    // Activities
    public void sleep() {
        System.out.println("Girlfriend's sleeping.");
    }

    public void eat() {
        System.out.println("Girlfriend's eating.");
    }
}
