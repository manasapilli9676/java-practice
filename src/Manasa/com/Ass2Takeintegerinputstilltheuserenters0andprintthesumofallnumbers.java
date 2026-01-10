package Manasa.com;
import java.util.Scanner;
public class Ass2Takeintegerinputstilltheuserenters0andprintthesumofallnumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum=0;
        int n=1;
        System.out.println("enter the values ");
        while(n!=0){

            n=input.nextInt();

            sum=sum+n;

        }
        System.out.println("sum of all inputs "+sum);
    }
}
