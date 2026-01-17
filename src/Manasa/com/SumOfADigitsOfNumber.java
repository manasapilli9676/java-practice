package Manasa.com;
import java.util.Scanner;
public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=input.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum Of A Digits Of Number "+sum);
    }
}
