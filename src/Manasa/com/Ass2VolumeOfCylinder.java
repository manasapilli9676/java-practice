package Manasa.com;
import java.util.Scanner;
public class Ass2VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius value");
        int radius=input.nextInt();
        System.out.println("enter the height value ");
        int height=input.nextInt();
        float volume=3.14f*radius*radius*height;
        System.out.println("Volume Of Cylinder "+ volume);
    }

}
