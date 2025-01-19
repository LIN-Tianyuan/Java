package methoddemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/19
 * @description ：
 * @version: 1.0
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        // Format of method definitions with parameters and invocations

        getSum(10,20);
    }


    public static void getSum(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
