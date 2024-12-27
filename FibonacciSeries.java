package Codes;

import java.util.*;

public class FibonacciSeries {
    public static void Fibo(int n){
        int first = 0;
        int second = 1;

        if (n < 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int temp = second;
            second = first + second;
            first = temp;

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Fibo(n);
    }
}
