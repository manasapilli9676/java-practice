package Manasa.com;
import java.util.Scanner;
public class Ass2CalculateDepreciationofValue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the real cost");
        int actual_cost=input.nextInt();
        System.out.println("enter the sell cost");

        int sell_cost=input.nextInt();
        System.out.println("no of years used");
        int years=input.nextInt();
        int total_loss=actual_cost-sell_cost;
        int deprecaitevalue=total_loss/years;
        System.out.println("Calculate Depreciation of Value "+deprecaitevalue);


    }
}
