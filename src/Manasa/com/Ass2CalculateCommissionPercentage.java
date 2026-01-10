package Manasa.com;
import java.util.Scanner;

public class Ass2CalculateCommissionPercentage
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Sales Amount:");
        double salesAmount = input.nextDouble();

        System.out.println("Enter Commission Percentage:");
        double commissionPercentage = input.nextDouble();


        double commissionAmount = (commissionPercentage * salesAmount) / 100;

        System.out.println("Commission Amount: " + commissionAmount);
    }
}
