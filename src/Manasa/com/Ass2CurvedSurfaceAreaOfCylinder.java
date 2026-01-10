package Manasa.com;
import java.util.Scanner;
public class Ass2CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of radius");
        int radius=input.nextInt();
        System.out.println("enter the value of height");
        int height=input.nextInt();
        float area=4*3.14f*radius*height;
        System.out.println("Curved Surface Area Of Cylinder "+area);
    }
}
