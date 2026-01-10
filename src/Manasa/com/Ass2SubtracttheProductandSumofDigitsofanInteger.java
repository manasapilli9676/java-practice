package Manasa.com;
import java.util.Scanner;
public class Ass2SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value ");
        int num=input.nextInt();
    int sum=0;
    int pro=1;
    while(num>0) {
        int rem = num % 10;
        pro = pro * rem;
        sum = sum + rem;
        num=num/10;
    }

        int sub=pro-sum;
        System.out.println("difference is" +sub);
    }
    }


