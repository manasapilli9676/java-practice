package Manasa.com;
import java.util.Scanner;
public class Ass2PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of side");
        int side=input.nextInt();
        int perimeter=4*side;
        System.out.println("perimeter of square "+side);
    }
}
