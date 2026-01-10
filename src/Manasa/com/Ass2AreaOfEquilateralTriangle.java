package Manasa.com;
import java.util.Scanner;
public class Ass2AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give the value of the side of the triangle");
        int lenght=input.nextInt();
        double  area=(Math.sqrt(3) / 4)*lenght*lenght;
        System.out.println("area of triangle "+area);
    }
}
