package com.lin.test;

import java.util.ArrayList;

/**
 * @author ：lin
 * @date ：Created in 2025/1/25
 * @description ：
 * @version: 1.0
 */
/*
Requirement:
    Define Javabean class : Phone
    Phone properties: brand, price.
    Define a collection in the main method that deposits three phone objects.
    They are: huawei, 1000. apple, 8000. xiaomi 2999.
    Define a method that returns information about phones with a price below 3000.
*/
public class Test8 {
    public static void main(String[] args) {

        // 1. Create a collection of objects
        ArrayList<Phone> list = new ArrayList<>();

        // 2. Create an object for a cell phone
        Phone p1 = new Phone("huawei",1000);
        Phone p2 = new Phone("apple",8000);
        Phone p3 = new Phone("xiaomi",2999);

        // 3. Add phone
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // 4. Call Methods
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        // 5. Iterate over the collection
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getPrice());
        }

    }


    // 1. What am I going to do? To look up information on my cell phone
    // 2. What do I need to do this thing to get it done?  Collections
    // 3. When I'm done, do I need to continue using the result at the method call?  return

    // Tricks:
    // If we want to return more than one piece of data, we can put it into a container and return the container first.
    // collections arrays
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        // Define a collection for storing cell phone objects that cost less than 3000
        ArrayList<Phone> resultList = new ArrayList<>();
        // Iterate over the collection
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            // If the price of the current phone is less than 3000, then add the phone object to the resultList
            if(price < 3000){
                resultList.add(p);
            }
        }
        // return resultList
        return resultList;

    }
}
