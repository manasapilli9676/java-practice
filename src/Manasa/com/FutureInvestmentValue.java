package Manasa.com;
import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the principle value");
        double P=input.nextDouble();
        System.out.println("enter the rate value");
        double R=input.nextInt();//practiced on jan 12

        System.out.println("enter the time ");
        double T=input.nextInt();
        double futureinvestment=P*Math.pow(1+(R/100),T);
        System.out.println("Future Investment Value "+futureinvestment);

    }
}
