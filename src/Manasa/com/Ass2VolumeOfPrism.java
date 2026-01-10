package Manasa.com;
import java.util.Scanner;
public class Ass2VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the height value ");
        int height=input.nextInt();
        System.out.println("enter the base value ");
        int base=input.nextInt();
        int volume=base*height;
        System.out.println("Volume Of Prism "+volume);

    }
}
