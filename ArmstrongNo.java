package Codes;

import java.util.*;

public class ArmstrongNo {
    public static boolean ArmstrongCheck(int number){
        int temp = number;
        int numberOfDigit = (int) Math.log10(number)+1;
        int sum = 0;
        while (number != 0){
            int rem = number % 10;
//            sum = sum + rem * rem * rem; // for 3-digit only
            sum += Math.pow(rem,numberOfDigit);
            number = number/10;
        }

        return sum == temp;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean result = ArmstrongCheck(number);
        System.out.println(result);
    }
}
