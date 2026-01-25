package Manasa.com;
import java.util.Scanner;
public class PrimeOrNotFunction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean prime=prime(num);
        if (prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }
    static  boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if (num%i== 0) {
                return false;
            }
        }
        return true;
        }

}
