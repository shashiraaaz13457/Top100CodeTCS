package Codes;

import java.util.*;

public class PalindromeNumber {
//    public static boolean PalindromeCheck(int num){
//        int temp = num;
//        int newNo = 0;
//        if(num < 0 ){
//            return false;
//        }
//        while(num != 0){
//            int rem = num % 10;
//            newNo = newNo * 10 + rem;
//            num /= 10;
//        }
//        if(newNo == temp){
//            return true;
//        }else{
//            return false;
//        }
//    }

    //Recursion Method
    public static boolean PalindromeCheck(int num,int newNo,int originalNO){

        if(num < 0 ){
            return false;
        }
        //Find base case for recursion
        if (num == 0) {
            return newNo == originalNO;
        }
            int rem = num % 10;
            newNo = newNo * 10 + rem;
            return PalindromeCheck(num/10,newNo,originalNO);
    }
    public static void main(String args[]){

        int newNo = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        boolean result = PalindromeCheck(number,newNo,temp);
        System.out.println(result);
    }
}
