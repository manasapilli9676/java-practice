package Manasa.com;
import java.util.Scanner;
public class FactorialProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
int next=1;
        while (n>=1){
           next=next*n;
n--;
        }

        System.out.println("Factorial value "+next);
    }
}
