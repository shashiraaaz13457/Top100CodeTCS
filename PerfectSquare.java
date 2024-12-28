package Codes;
import java.util.*;
public class PerfectSquare {
// 1st method - > Good logic but not efficient
//    public static boolean FindPerfectSquare(int number){
//        if(number == 1){
//            return true;
//        }
//        if(number < 0){
//            return false;
//        }
//
//        for (int i = 2; i < Math.sqrt(number) ; i++) {
//            int div = number/ i ;
//            if(div == i){
//                return true;
//            }
//        }
//        return false;
//    }

    // 2nd Method
//public static boolean FindPerfectSquare(int number) {
//    if (number < 0) {
//        return false;
//    }
//    int sqrt = (int) Math.sqrt(number); // Calculate the square root
//    return sqrt * sqrt == number;
//}

    //3rd method
    public static boolean FindPerfectSquare(int number) {
    if (number < 0) {
        return false;
    }
        if (number == 1 || number == 0) {
            return true;
        }
        for (int i = 2; i * i  <= number ; i++) {
            if (i * i == number){
                return true;
            }
        }
        return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

       boolean result =  FindPerfectSquare(number);
        System.out.println(result);


    }
}
