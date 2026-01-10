package Manasa.com;
import java.util.Scanner;
public class Ass1EvenOrOdd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");

        }
        else
        {
            System.out.println("number is odd");
        }
    }
}
