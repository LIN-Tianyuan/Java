package com.lin.test3;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        // Create object
        GirlFriend gf1 = new GirlFriend();
        // Assign values
        gf1.setName("Luna");
        gf1.setAge(18);
        gf1.setGender("Woman");


        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());


        gf1.eat();
        gf1.sleep();


    }
}
