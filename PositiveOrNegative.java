package Codes;
import java.util.*;
public class PositiveOrNegative {

    public static void PositiveNegative(int num){
        if(num == 0){
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PositiveNegative(num);
    }
}
