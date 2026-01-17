package Manasa.com;
import java.util.Scanner;
public class CompoundInterestJavaProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the principle value");
        double P=input.nextInt();
        System.out.println("enter the rate value");
        double R=input.nextInt();//practiced on jan 12

        System.out.println("enter the time ");
        double T=input.nextInt();
        double compound_interest=P*Math.pow(1+(R/100),T)-P;
        System.out.println("Compound Interest Java Program "+compound_interest);

    }
}
