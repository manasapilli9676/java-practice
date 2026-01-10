package Manasa.com;
import java.util.Scanner;
public class Ass2PerimeterOfRectangle {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of length");
        int length=input.nextInt();
        System.out.println("enter the va;ue of breadth");
        int breadth=input.nextInt();
        int perimeter=2*(length+breadth);
        System.out.println("perimeter of rectangle "+perimeter);
    }
}
