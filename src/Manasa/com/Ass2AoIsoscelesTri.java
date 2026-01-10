package Manasa.com;
import java.util.Scanner;
public class Ass2AoIsoscelesTri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the base value ");
        float base=input.nextFloat();
        System.out.println("enter the value of height");
        float height=input.nextFloat();
        float area =0.5f*height*base;
        System.out.println("area of the isosceles triangle " +area);

    }
}
