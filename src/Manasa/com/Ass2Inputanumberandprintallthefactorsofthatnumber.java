package Manasa.com;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Ass2Inputanumberandprintallthefactorsofthatnumber {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter the value ");
        int num=input.nextInt();
        int n=1;
        while(n<=num){
            if(num%n==0){
                System.out.println("factorial of num "+n);
            }

            n++;
        }
}
}
