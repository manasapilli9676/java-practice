package Manasa.com;
import java.util.Scanner;
public class ArmstrongInMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        System.out.println(isArmstrong(n));
        for(n=100;n<=999;n++){
            if(isArmstrong(n)){
                System.out.println(n+ " ");
            }
        }
//        int num=100;
//        int rem=0;
//
//        double sum=0;
//        while(num<=999) {
//            int d = num;
//            while (d > 0) {
//                rem = num % 10;
//                num = num / 10;
//                double ans = Math.pow(rem, 3);
//                sum = sum + ans;
//            }
//
//            if (sum == num) {
//                System.out.println(num);
//            }
//            num++;
//        }
    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
