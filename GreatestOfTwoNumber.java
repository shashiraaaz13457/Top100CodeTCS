package Codes;

import java.util.*;

public class GreatestOfTwoNumber {
    public static int Greatest(int num1,int num2){
        if(num1 > num2){
            return num1;
        } else if (num1 < num2) {
            return num2;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = Greatest(num1,num2);
        System.out.println(result);
    }
}
