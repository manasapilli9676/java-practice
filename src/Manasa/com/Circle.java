package Manasa.com;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int radius=input.nextInt();
       float c= circum(radius);
        float a=area(radius);
        System.out.println(c);
        System.out.println(a);

    }
    static float circum(int radius){
        float circumference=2*3.14f*radius;
        return circumference;
    }
    static  float area(int radius){
        float areas=3.14f*radius*radius;
        return areas;
    }

}
