package Codes;
import java.util.*;
public class ArmstrongNoInAGivenRange {
    public static void getArmstrongSum(int initial,int last){

        for (int i = initial; i <= last; i++) {
            int sum = 0;//Yaad rkna double kyu use kiya h kyuki Math.pow returning value in double.
            int temp = i;
            while(temp != 0){
                int rem =  temp % 10;
                int numberofDigit = (int)Math.log10(i)+1;

                sum = (int)(sum + Math.pow(rem,numberofDigit));
                temp = temp/10;
            }
            if (i == sum){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first range : ");
        int initial = sc.nextInt();
        System.out.println("Enter the last range: ");
        int last = sc.nextInt();

        getArmstrongSum(initial,last);
//        System.out.println(result);
    }
}
