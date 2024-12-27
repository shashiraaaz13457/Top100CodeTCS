package Codes;
import java.util.*;
public class PowerOfNumber {
//    public static double Power(int num,int pow){
//        double power ;
//        power = Math.pow(2,3);
//        return power;
//    }
    public static double Power(int num,int pow){
        double res = 1;
        //Jbtk power 0 nhi ho rha tb tk number ko khud se multiply krte rho Intresting!
        while(pow != 0 ){
            res = res * num;
            pow--;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the power : ");
        int pow = sc.nextInt();

        double result = Power(number,pow);
        System.out.println(result);
    }
}
