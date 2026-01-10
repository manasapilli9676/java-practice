package Manasa.com;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int num=input.nextInt();
        int i=0;                   // initialization
        /*syntax for while loop
        while(condition)
        {
        //body
        incrment/decrement
        }
        */
        while(i<num) {               //condition
            System.out.println(i);
            i++;                   //increament and decrement
        }
    }
}
