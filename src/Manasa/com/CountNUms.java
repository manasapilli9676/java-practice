package Manasa.com;
import java.util.Scanner;
public class CountNUms {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int p=input.nextInt();
        int c=0;
     while(p>0){
      int rem=p%10;
      if(rem==5){
          c++;
      }
      p=p/10;
     }
        System.out.println(c);
    }
}
