package Manasa.com;
//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class EvenOddMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        oddeven(n);


    }
    static void oddeven(int n){
        if(n%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
