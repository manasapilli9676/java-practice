package Manasa.com;
import java.util.Scanner;
public class PalindromeMethodjava {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int x=num;
        int next=1;
        boolean palindrom=palin(x);
        if(palindrom){
            System.out.println("it is a palindrom");
        }
        else{
            System.out.println("it is not a palindrome");
        }

    }
    static boolean palin(int x){
       int num=x;
        int rem=x%10;
        int next=1;
        x=x/10;
         next=next*10+x;
         if(next==x){
             return true;

         }
         else{
             return false;
         }
    }


}
