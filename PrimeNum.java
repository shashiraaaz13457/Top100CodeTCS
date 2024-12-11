package Codes;
import java.util.*;
public class PrimeNum {
    public static void PrimeNum(int num){
        if (num < 2){
            System.out.println(" NOt a Prime");
            return;
        }
        //Reminder : Please carefully observe that the loop and think where to use return statement.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

         PrimeNum(num);
//        System.out.println(result);
    }
}
