package Manasa.com;
import java.util.Scanner;
public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first num");
        int num1=input.nextInt();
        System.out.println("enter the seconf num");
        int num2=input.nextInt();
        int i=1;
        while(true){
            if(num1%i==0&&num2%i==0){
                System.out.println(i);
                break;

            }
            i++;

        }


    }
}
