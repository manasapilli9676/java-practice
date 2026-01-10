package Manasa.com;
import java.util.Scanner;
public class Ass1SimpleIntrest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of P");
        float p = input.nextFloat();
        System.out.println("enter the value t ");
        int t=input.nextInt();
        System.out.println("enter the r value");
        int r=input.nextInt();
        float result=p*t*r/100;
        System.out.println("simple intrest is "+result);
    }
}
