package Codes;

import java.util.*;

public class ArmstrongNo {
//    public static boolean ArmstrongCheck(int number){
//        int temp = number;
//        int numberOfDigit = (int) Math.log10(number)+1;
//        int sum = 0;
//        while (number != 0){
//            int rem = number % 10;
////            sum = sum + rem * rem * rem; // for 3-digit only
//            sum += Math.pow(rem,numberOfDigit);
//            number = number/10;
//        }
//
//        return sum == temp;
//
//    }
//Recursion Method

//    private static boolean ArmstrongCheck(int num, int numberOfDigit,int reverse) {
//        if(num == 0)
//            return 0;
//
//        int digit = num % 10;
//        reverse = (int) Math.pow(digit, numberOfDigit) + ArmstrongCheck(num/10, numberOfDigit,reverse)
//        return reverse == num;
//    }
private static int getArmstrongSum(int num, int numberOfDigit) {
    if(num == 0)
        return 0;

    int digit = num % 10;

    return (int) Math.pow(digit, numberOfDigit) + getArmstrongSum(num/10, numberOfDigit);

}

    public static boolean ArmstrongNoCheck(int num,int numberOfDigit){
        if (num == getArmstrongSum(num, numberOfDigit))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberOfDigit = (int) Math.log10(number)+1;

        boolean result = ArmstrongNoCheck(number,numberOfDigit);
        System.out.println(result);
    }
}
