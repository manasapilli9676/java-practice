package Manasa.com;
import java.util.Scanner;
public class Ass2AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of d1");
        float d1=input.nextFloat();
        System.out.println("enter the value of d2");
    float d2=input.nextFloat();
    float area=0.5f*d1*d2;
        System.out.println("area of the rhombus "+area);
    }
}
