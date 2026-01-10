package Manasa.com;
import java.util.Scanner;
public class Takeintegerinputstilltheuserenters0andprintthelargestnumberfromall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1;
        int x=0;
        while(n!=0){
            n=input.nextInt();

            if(n>x){
                x=n;
            }



        }
        System.out.println("it is the large number "+x);

    }
}
