 package Manasa.com;
import java.util.Scanner;
public class Ass2AParallelogram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the base of  Parallelogram");
        float base=input.nextFloat();
        System.out.println("enter the height of parallelogram");
        float height=input.nextFloat();
        float area=base*height;
        System.out.println("area of parallelogram is "+area);
    }
}
