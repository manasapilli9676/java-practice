package Manasa.com;
import java.util.Scanner;
public class Ass2PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side ");
        int side=input.nextInt();
        int perimeter=4*side;
        System.out.println("Perimeter Of Rhombus "+perimeter);
    }
}
