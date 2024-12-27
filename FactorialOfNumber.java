package Codes;
import java.util.*;
import java.math.BigInteger; //You have to Import this for BigInt
public class FactorialOfNumber {
//    public static BigInteger Factorial(int num){
//        BigInteger fact = BigInteger.ONE;
////        int fact = 1;
//
//        if (num == 0){
//            return BigInteger.ONE;
//        }
//        for (long i = 1; i <= num; i++) {
////            fact = fact * i;
//            fact = fact.multiply(BigInteger.valueOf(i));
//        }
//        return fact;
//    }
    public static int fact (int num){
        int fact = 1;
        if(num == 0){
            return 1;
        }
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//        BigInteger result = Factorial(number);
        int result = fact(number);
        System.out.println(result);
    }
}
