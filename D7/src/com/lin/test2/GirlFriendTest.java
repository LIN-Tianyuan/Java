package com.lin.test2;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        // Create a girlfriend object
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "Luna";
        gf1.age = 18;
        gf1.gender = "Woman";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();


        System.out.println("===================");
        GirlFriend gf2 = new GirlFriend();
        gf2.name = "Siri";
        gf2.age = 19;
        gf2.gender = "Woman";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);

        gf2.eat();
        gf2.sleep();


    }
}
