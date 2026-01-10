package Manasa.com;
import java.util.Scanner;
public class Ass2AOcircle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the radius os the circle");
        float radius=input.nextFloat();
         float area=3.14f*radius*radius;
        System.out.println(area);
    }
}
