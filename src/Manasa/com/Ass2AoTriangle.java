package Manasa.com;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Ass2AoTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the breadth value");
        float breadth = input.nextFloat();
        System.out.println("enter the length value");
        float length=input.nextFloat();
        float area=05f*length*breadth;
        System.out.println("area of triangle is "+area);
    }
}
