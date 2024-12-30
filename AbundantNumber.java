package Codes;
import java.util.*;
public class AbundantNumber {
    public static boolean CheckAbundantNO(int num){

        // 1st method
//        int sum = 0;
//        for (int i = 1; i <= num/2; i++) {
//            if (num % i == 0) {
//                sum = sum + i;
//            }
//        }
        //2nd Method(efficient one) :- Try to do your own then see the code..
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0){
                if (i == num/i){
                    sum = sum + i; // Add the divisor only once if its a perfect square.
                }else {
                    sum += i + num/i; // add both the divisor if it's not a perfect square.
                }
            }
        }
        if (sum > num){
            System.out.println("The abundance is : " + (sum - num));//Abundance mtlb itna zyada h number.
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (CheckAbundantNO(number)){
            System.out.println("It's an abundant number");
        }else {
            System.out.println("It's not an abundant number");
        }
    }
}
