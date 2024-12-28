package Codes;

import java.util.*;
public class PerfectNumber {
    //Perfect number - > A number which sum of its factor except the number itself.
    // Eg : - 6 = 1 + 2 + 3

    public static void CheckPerfectNo(int num){
        int sum = 0;
        //1st method
//        for (int i = 1; i < num; i++) {
//            if(num % i == 0){
//                sum = sum + i;
//            }
//        }

        //2nd method
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a perfect number" );
        }else{
            System.out.println(num + " is not a perfect number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        CheckPerfectNo(number);
    }
}
