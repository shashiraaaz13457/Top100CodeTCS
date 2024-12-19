package Codes;
import java.util.*;

public class ReverseANumber {
//    public static int Reverse(int num){
//        int prod = 0;
//        while(num != 0){
//            int rem = num % 10;
//            prod = prod * 10 + rem;
//            num = num/10;
//        }
//        return prod;
//    }

    //Now the recursion method.
    public static int Reverse(int num , int prod){
        if(num == 0){
            return prod;
        }
        int rem = num % 10;
        prod = prod * 10 + rem;
        num = num/10;

        return Reverse(num,prod);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int prod = 0;
        int result = Reverse(num,prod);
        System.out.println(result);
    }
}
