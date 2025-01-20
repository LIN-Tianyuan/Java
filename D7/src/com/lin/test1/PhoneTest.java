package com.lin.test1;

/**
 * @author ：lin
 * @date ：Created in 2025/1/20
 * @description ：
 * @version: 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        // Create an object for a cell phone
        Phone p = new Phone();

        // Assign a value to a cell phone
        p.brand = "Apple";
        p.price = 1999.98;

        // Get the value in the phone object
        System.out.println(p.brand);
        System.out.println(p.price);


        // Call methods in the phone
        p.call();
        p.playGame();


        Phone p2 = new Phone();
        p2.brand = "Huawei";
        p2.price = 8999;

        p2.call();
        p2.playGame();
    }
}
