package Manasa.com;
import java.util.Scanner;
public class FindNcrAndNpr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=input.nextInt();
        System.out.println("enter the r value");
        int r=input.nextInt();
        int next=1;
        int den1=1;
        int den=1;
        int x=1;
        int denominator;
        for(int i=1;i<=n;i++){
            next=next*i;


        }
        for(int i=1;i<=(n-r);i++){
            den1=den1*i;
        }
        for(int i=1;i<=r;i++){
            den=den*i;
        }
         denominator=den1*den;
        if(denominator!=0){
            int result=next/denominator;
            System.out.println(result);
        }

    }
}
