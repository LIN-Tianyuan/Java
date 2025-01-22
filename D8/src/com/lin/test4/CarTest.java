package com.lin.test4;
import java.util.Scanner;

/**
 * @author ：lin
 * @date ：Created in 2025/1/23
 * @description ：
 * @version: 1.0
 */
public class CarTest {
    public static void main(String[] args) {
        // 1. Create an array to hold 3 car objects.
        Car[] arr = new Car[3];

        // 2. Create a car object with data from keyboard entry
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            // Create an object for a car
            Car c = new Car();
            // Enter the brand
            System.out.println("Please enter the make of the car:");
            String brand = sc.next();
            c.setBrand(brand);
            // Enter the price
            System.out.println("Please enter the price of the car:");
            int price = sc.nextInt();
            c.setPrice(price);
            // Enter the color
            System.out.println("Please enter the color of the car:");
            String color = sc.next();
            c.setColor(color);

            // Add a car object to an array
            arr[i] = c;
        }

        // 3. Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + ", " + car.getPrice() + ", " + car.getColor());
        }
    }
}
