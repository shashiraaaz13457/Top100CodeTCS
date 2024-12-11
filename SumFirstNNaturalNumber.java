package Codes;
import java.util.*;
public class SumFirstNNaturalNumber {

    public static int SumOfFirstNNaturalNUM(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;

        //formula based
        //(n *(n+1)/2)
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = SumOfFirstNNaturalNUM(num);
        System.out.println(result);
    }
}
