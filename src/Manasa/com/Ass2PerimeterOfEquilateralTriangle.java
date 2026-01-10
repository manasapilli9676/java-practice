package Manasa.com;
import java.util.Scanner;
public class Ass2PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side of the triangle value ");
        float side=input.nextFloat();
        float perimeter=3*side;
        System.out.println("perimeter of the triangle "+perimeter);
    }
}
