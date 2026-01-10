package Manasa.com;
import java.util.Scanner;
public class Ass2VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius ");
        int radius=input.nextInt();
        float area=(1.33f)*3.14f*radius*radius*radius;
        System.out.println("volume of sphere"+area);
    }
}
