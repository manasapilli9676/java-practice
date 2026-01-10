package Manasa.com;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
     int p=input.nextInt();
     int ans=0;

     while(p>0) {
         int rem=p%10;
         p=p/10;
           ans=ans*10+rem;

     }
        System.out.print(ans);


    }
}
