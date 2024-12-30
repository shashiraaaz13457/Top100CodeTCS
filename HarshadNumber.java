package Codes;
import java.util.*;
public class HarshadNumber {
    //Harshad Number :- It is a number which is completely divisible by sum of its digits.
    public static boolean CheckHarshadNo(int num){
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum + rem;
            temp /= 10;
        }
        if (num % sum == 0 ){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//        boolean result = CheckHarshadNo(number);
//        System.out.println(result);
        if (CheckHarshadNo(number)){
            System.out.println("Harshad number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
}
