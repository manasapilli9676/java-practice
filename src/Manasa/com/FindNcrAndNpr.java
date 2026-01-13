package Manasa.com;
import java.util.Scanner;
public class FindNcrAndNpr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=input.nextInt();
        System.out.println("enter the r value");
        int r=input.nextInt();
        int numerator;
        int denominator;
        int x=(n-r);
        int next=1;
        int den=1;
        int den1=1;
        while(n>0){
            next=next*n;


        }
        while(x>0){
            den1=den1*x;
        }
        while(r>0){
            den=den*r;
        }
         denominator=den1*den;
        if(denominator!=0){
            int result=next/denominator;
            System.out.println(result);
        }

    }
}
