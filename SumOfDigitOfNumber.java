package Codes;

import java.util.*;

public class SumOfDigitOfNumber {
//    public static int Sum(int number){
//        int sum = 0;
//        while(number != 0){
//            int rem = number%10;
//            sum = sum + rem;
//            number = number/10;
//        }
//        return sum;
//    }

    //See the recursion method.
    public static int Sum(int num,int sum){
        if(num == 0){
            return sum;
        }
        int rem = num%10;
        sum = sum + rem;
        return Sum(num/10,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int result = Sum(number,sum);
        System.out.println(result);
    }
}
