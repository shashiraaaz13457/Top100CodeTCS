package Codes;

import java.util.*;

public class FindPrimeFactors {

    public static int isPrime(int num){
        if (num == 1) {
            return 1;
        }
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    //Pleasee see this kind of pattern to solve this kind of problem.
    public static void primeFactors(int num){
        for (int i = 2; i <= num ; i++) {
            if (isPrime(i) == 1){
                int x = num;
                while(x%i == 0){
                    System.out.println(i + " ");
                    x = x / i;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        primeFactors(number);
//        int result = primeFactors(number);
//        System.out.println(result);
    }
}
