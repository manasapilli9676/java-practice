package Manasa.com;
import java.util.Scanner;
public class Ass2TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of side of cube ");
        int side=input.nextInt();
        int area=side*side*side;
        System.out.println("Total Surface Area Of Cube "+area);
    }

}

