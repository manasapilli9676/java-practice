package Manasa.com;

import java.util.Scanner;


public class FutureInvestmentValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int years = sc.nextInt();

        double futureValue = principal * Math.pow((1 + rate), years);

        System.out.println("Future Investment Value = " + futureValue);
    }
}
