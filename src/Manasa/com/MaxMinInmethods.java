package Manasa.com;
import java.util.Scanner;
public class MaxMinInmethods {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        max(num1,num2,num3);
        min(num1,num2,num3);

    }
    static void max(int num1,int num2,int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println("greater number is " + num1);
        } else if (num2 > num3) {
            System.out.println("greater number is " + num2);

        } else {
            System.out.println("greater is number is " + num3);
        }
    }
        static void min(int num1,int num2,int num3){
        if(num1<num2&&num1<num3){
            System.out.println("smaller number is "+num1);
        }
        else if(num2<num3){
            System.out.println("the smallest number is "+num2);
        }
        else {
            System.out.println("smallest number is "+num3);
        }
    }
}
