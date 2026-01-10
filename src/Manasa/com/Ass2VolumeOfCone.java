package Manasa.com;
import java.util.Scanner;
public class Ass2VolumeOfCone {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of height ");
        int height=input.nextInt();
        System.out.println("enter the value of Radius");
        int radius=input.nextInt();
        float volume=0.33f*3.14f*radius*radius*height;
        System.out.println("Volume Of Cone "+volume);
    }
}
