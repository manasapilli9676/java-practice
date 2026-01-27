package Manasa.com;
import java.util.Scanner;
public class PalindromeMethodjava {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean palin=palindrome(num);
       if(palin){
           System.out.println("it is a palindrome");
       }
       else{
           System.out.println("it is not a palindrom");
       }

    }
    static boolean palindrome(int num){
        int x=num;
        int reverse=0;
        while(x>0){
            int rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;
        }
        return reverse==num;
    }
}
