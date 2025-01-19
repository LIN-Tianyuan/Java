package methoddemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/19
 * @description ：
 * @version: 1.0
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        // Define two variables inside the method and sum them for printing.

        getSum();

    }

    public static void getSum(){
        int num1 = 10;
        int num2 = 20;

        int result = num1 + num2;
        System.out.println(result);
    }
}
