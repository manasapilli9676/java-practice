package Manasa.com;
import java.util.Scanner;
public class Ass2CalculateDiscountOfProduct {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the markedprize value");
        int markedprize = input.nextInt();
        System.out.println("enter the discout in persentage ");
        float discount = input.nextFloat();
        float discount_amount = (discount * markedprize) / 100;
        System.out.println("Calculate Discount Of Product"+discount_amount);
    }
}
