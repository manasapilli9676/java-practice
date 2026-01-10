package Manasa.com;
import java.util.Scanner;
public class Ass2PerimeterOfCircle {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius value");
        float radius=input.nextFloat();
        double perimeter=2*3.14d*radius;
        System.out.println("perimeter of the circle is "+perimeter);
    }
}
