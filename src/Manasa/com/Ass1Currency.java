package Manasa.com;
import java.util.Scanner;
public class Ass1Currency {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give the value of currency in India ");
        float rupees=input.nextFloat();
        Float USD=rupees/80;
        System.out.println("required output for the input currency in USD "+USD);

    }
}
