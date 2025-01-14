package com.lin.operator;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);//5
        // -
        System.out.println(5 - 1);//4
        // * (shift + Number 8)
        System.out.println(7 * 9);//63

        // If there are decimals involved in the calculation, it is possible that the result will be imprecise.
        System.out.println(1.1 + 1.1); // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);

        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335

        // Take the modulus and take the remainder.
        // In effect, doing division, except that get the remainder.
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1

        // Application Scenarios:
        // 1. Use modulo to determine whether A is divisible by B or not.
        // A % B 10 % 3
        // 2. Determine whether A is an even number.
        // If the result is 0, then A is an even number. If the result is 1, then it is proved that A is an odd number.

        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte)(b1 + b2);
        System.out.println(result); // 30

        char ch = 'a';
        int result2 = ch + 1;
        System.out.println(result2); // 98

        //++ 和 --
        int a = 10;
        // means that the value inside the variable a +1
        a++;
        System.out.println(a); // 11
        // means that the value inside the variable a +1
        ++a;
        System.out.println(a);//12
        // means that the value inside the variable a -1
        a--;
        System.out.println(a); // 11
        // means that the value inside the variable a -1
        --a;
        System.out.println(a); // 10


        int c = 10;
        int d = 10;
        boolean b = ++c < 5 && ++d < 5;
        System.out.println(c);  // 11
        System.out.println(d);  // 10

        int x = 10;
        // after ++: use first then add
        // Take the value in the x variable and use it first, assign it to y, and then self-increment.
        // The value assigned to y is before the self-increment.
        int y = x++; // x = 11  y = 10
        // first++: add first and use later
        // First self-increment x, then assign the result of the self-increment to the left variable
        // First self-increment x to 12, then assign the 12 after self-increment to z
        int z = ++x; // x = 12 z = 12
        System.out.println("x:" + x);   // 12
        System.out.println("y:" + y);   // 10
        System.out.println("z:" + z);   // 12

    }
}

