package com.lin.test5;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 1. Create an array
        Phone[] arr = new Phone[3];

        // 2. Create the object of the cell phone
        Phone p1 = new Phone("Xiaomi",1999,"White");
        Phone p2 = new Phone("Huawei",4999,"Blue");
        Phone p3 = new Phone("Apple",3999,"Red");

        // 3. Add the cell phone object to the array.
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        // 4. Get the average price of three cell phones
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // i index arr[i] element (cell phone object)
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }

        // 5. Finding the average
        // Try not to write the data to death if you can.
        // int avg = sum / arr.length; //int avg = sum / arr.length; //int avg = sum / arr.

        double avg2 = sum * 1.0 / arr.length;

        System.out.println(avg2);   // 3665.6666666666665
    }
}
