package methoddemo;

/**
 * @author ：lin
 * @date ：Created in 2025/1/19
 * @description ：
 * @version: 1.0
 */
public class MethodDemo5 {
    public static void main(String[] args) {
        // Definition and Call Format of Methods with Return Values

        // Calculate the turnover for the first quarter
        int sum1 = getSum(10,20,30);
        // Calculate the turnover for the second quarter
        int sum2 = getSum(20,30,40);
        // Calculate the turnover for the third quarter
        int sum3 = getSum(20,30,40);
        // Calculate the turnover for the fourth quarter
        int sum4 = getSum(20,30,40);

        // Find the total turnover for the year
        int sum = sum1 + sum2 + sum3 + sum4;

        System.out.println(sum);


    }

    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;  // Returns to the caller of the method
    }
}
