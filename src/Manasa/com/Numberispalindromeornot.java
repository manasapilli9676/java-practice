package Manasa.com;
import java.util.Scanner;
public class Numberispalindromeornot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number is palindrome or not");
        int num=input.nextInt();
        int palindrome=0;
        while(num>0){
            int rem=num%10;
            palindrome=num*10+rem;
                    num=num/10;
        }
        if(palindrome==num){
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("given number not is palindrome");
        }

    }
}
