package Codes;

import java.util.Scanner;
//Only the efficient code is done here
public class FriendlyPair {
    // Friendly Pair :- The number whose (sum of divisors)/number ratio is same are known as Friendly Pair.
    public static boolean CheckFriendlyPair(int num1 , int num2){
        if (num1 <= 0 || num2 <= 0){
            return false;
        }
        int sum1 = 1;
        int sum2 = 1;//Because 1 is always the factor.
        for (int i = 2;i <= Math.sqrt(num1);i++){
            if (num1 % i == 0){
                if (i == num1/i){
                    sum1 = sum1 + i;
                }else{
                    sum1 = sum1 + i + num1/i;
                }
            }

        }
        for (int i = 2;i <= Math.sqrt(num2);i++){
            if (num2 % i == 0) {
                if (i == num2/i){
                    sum2 = sum2 + i;
                }else{
                    sum2 = sum2 + i + num2/i;
                }
            }

        }
        double ratio1 = (double) sum1/num1;
        double ratio2 = (double) sum2/num2;

        return ratio1 == ratio2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if(CheckFriendlyPair(number1, number2)){
            System.out.println(number1 + " and " + number2 + " are friendly pairs");

        }else {
            System.out.println(number1 + " and " + number2 + " are not friendly pairs");
        }
    }
}
