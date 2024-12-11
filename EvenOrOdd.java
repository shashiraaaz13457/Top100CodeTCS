package Codes;
import java.util.*;

public class EvenOrOdd {
//    public static void EvenOdd(int num){
//        if(num % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//    }
public static void EvenOdd(int num){
    if ((num & 1) == 1){
        System.out.println("odd");
    }else{
        System.out.println("Even");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        EvenOdd(num);
    }
}
