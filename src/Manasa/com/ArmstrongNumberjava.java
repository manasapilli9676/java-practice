package Manasa.com;
import java.util.Scanner;
public class ArmstrongNumberjava {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        int x=input.nextInt();
        int y=x;
        double sum=0;
        while(x>0)
        {
          int rem=x%10;
          sum=sum+Math.pow(rem,3);
          x=x/10;

        }
        if(y==sum){
            System.out.println("given number is arm strong");
        }
        else{
            System.out.println("given number is not a armstrong number");
        }

    }
}
