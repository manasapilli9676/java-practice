package Manasa.com;
import java.util.Scanner;
public class Ass2VolumeOfPyramid {//square pyramid
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side value ");
        int side=input.nextInt();
        System.out.println("enter the height value ");
        int height=input.nextInt();
        int area=side*side;
        float volume=0.3f*area*height;
        System.out.println("Volume Of Pyramid "+volume);
    }
}
