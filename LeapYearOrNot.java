package Codes;
import  java.util.*;

public class LeapYearOrNot {
//    public static void LeapYear(int year){
//        if (year % 4 == 0 ){
//            if (year % 100 == 0 ){
//                if (year % 400 == 0) {
//                    System.out.println("Leap year");
//                }else{
//                    System.out.println("Not a Leap year");
//                }
//            }else {
//                System.out.println("Leap year");
//            }
//        }else{
//            System.out.println("Not a leap year");
//        }
//    }
    public static void LeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        LeapYear(year);
    }
}
