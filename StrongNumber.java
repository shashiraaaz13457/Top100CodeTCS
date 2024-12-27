package Codes;

import java.util.*;

public class StrongNumber {
    public static int factorial(int number){
        int fact = 1;
        for (int i = 1; i <= number ; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean StrongNumber(int num){
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum + factorial(rem);
            temp /= 10;
        }
        if (sum == num){
            return true;
        }else{
            return false;
        }

//        int res = 1;
//        while(num != 0){
//            int rem = num % 10;
//            for (int i = rem; i < 1; i--) {
//                res *= i;
//            }
//            num = num / 10;

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (StrongNumber(number)){
            System.out.println(number + " is a Strong Number");
        }else{
            System.out.println(number + " is not a strong number");
        }
    }
}
