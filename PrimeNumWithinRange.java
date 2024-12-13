package Codes;
import java.util.Scanner;
public class PrimeNumWithinRange {
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        for (int i = lower; i <= upper; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
