package Manasa.com;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class PowerInjava {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the base value");
        int base = input.nextInt();
        System.out.println("enter the exponent value");
        int exponent=input.nextInt();
        double power=Math.pow(base,exponent);
        System.out.println("Power In Java\n"+power);

    }
}
