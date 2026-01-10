package Manasa.com;
import java.util.Scanner;
public class Ass2AOfrectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length value");
        float length=input.nextFloat();
        System.out.println("enter the breadth value");
        float breadth=input.nextFloat();
        float area=length*breadth;
        System.out.println("area of recatngle "+area);
    }
}
