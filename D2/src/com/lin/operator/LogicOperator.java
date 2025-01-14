package com.lin.operator;

/**
 * @author ：lin
 * @date ：Created in 2025/1/14
 * @description ：
 * @version: 1.0
 */
public class LogicOperator {
    public static void main(String[] args) {
        // 1.& and
        // Both sides are true. The result is true.
        System.out.println(true & true);    // true
        System.out.println(false & false);  // false
        System.out.println(true & false);   // false
        System.out.println(false & true);   // false


        // 2.| or
        // Both sides are false. The result is false.
        System.out.println(true | true);    // true
        System.out.println(false | false);  // false
        System.out.println(true | false);   // true
        System.out.println(false | true);   // true

        // ^ differentiation
        // Same is false, different is true.
        System.out.println(true ^ true);    // false
        System.out.println(false ^ false);  // false
        System.out.println(true ^ false);   // true
        System.out.println(false ^ true);   // true


        //! logical non - inverse
        System.out.println(!false); // true
        System.out.println(!true);  // false

        // 3.&&
        System.out.println(true && true);   // true
        System.out.println(false && false); // false
        System.out.println(false && true);  // false
        System.out.println(true && false);  // false


        //4.||
        System.out.println(true || true);   // true
        System.out.println(false || false); // false
        System.out.println(false || true);  // true
        System.out.println(true || false);  // true


        // 5.Short-circuit logical operators have a short-circuit effect
        // When the expression on the left side can determine the final result, then the right side will not be involved in the run
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result); // false
        System.out.println(a);  // 11
        System.out.println(b);  // 10
    }
}
