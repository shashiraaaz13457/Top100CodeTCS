package Codes;

import java.util.*;

public class SumOfNumberInAGivenRange {
    public static int SumOfNumberAGivenRange(int num1,int num2){
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = SumOfNumberAGivenRange(num1,num2);
        System.out.println(result);
    }
}
