package Manasa.com;
import java.util.Scanner;
public class CheckprimeInMethods {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int n= input.nextInt();
        boolean ans=isprime(n);
        System.out.println(ans);
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}