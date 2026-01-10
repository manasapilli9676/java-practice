package Manasa.com;
import java.util.Scanner;
public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the units of used ");
        int units=input.nextInt();
        int bill;
    if (units <= 50) {
        bill = units * 3;
    } else if (units < 100) {
        bill = (50*3)+(units-50)* 5;
    } else {
        bill = (50*3)+(50*5)+(units-100)*7;
    }
    System.out.println("amount to pay " + bill);
}

    }

