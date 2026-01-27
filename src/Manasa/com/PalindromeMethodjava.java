package Manasa.com;
import java.util.Scanner;
public class PalindromeMethodjava {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int next=1;
        boolean palindrom=palin(num);
        if(palindrom){
            System.out.println("it is a palindrom");
        }
        else{
            System.out.println("it is not a palindrome");
        }

    }
    static boolean palin(int num){
        int next = 0;
        int x=num;


       while(num>0) {
           int rem = x % 10;
           next = next * 10 + rem;
           x = x / 10;
       }


    return num==next;
         }
    }



