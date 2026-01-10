package Manasa.com;
import java.util.Scanner;
public class CalculateDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x1=input.nextInt();
        int x2=input.nextInt();
        int y1=input.nextInt();
        int y2=input.nextInt();
        int firstterm=(x2-x1);
        int x=firstterm*firstterm;
        int secondterm=(y2-y1);
        int y=secondterm*secondterm;
        int number=x+y;
        double distance=Math.sqrt(number);
        System.out.println("Calculate Distance Between Two Points\n"+distance);




    }
}
