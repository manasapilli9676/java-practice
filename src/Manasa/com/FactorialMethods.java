package Manasa.com;
import java.util.Scanner;
public class FactorialMethods {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
      int ans= factorial(num);
        System.out.println(ans);

    }
    static int factorial(int num){
        int next=1;
        for( int i=num;i>=1;i--){

            next=i*next;

        }
        return next;


    }

}
