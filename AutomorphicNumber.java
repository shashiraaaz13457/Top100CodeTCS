package Codes;

import java.util.*;


//Automorphic NO -> It is a number when squared ends with the number itself.
//E.g - > 5 - > 25 (ending with 5)
public class AutomorphicNumber {

    public static boolean CheckAutomorphic(int num) {
        //keep in mind the inner if - else condition why we are taking not operator into consideration
        int squared = num * num;
        while (num != 0) {
            if (squared % 10 != num % 10) {
                return false;
            }
            num /= 10;
            squared /= 10;
        }
        return true;
    }
// for 890625 - it is exceeding the range of int.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean result = CheckAutomorphic(number);
        System.out.println(result);
    }
}

