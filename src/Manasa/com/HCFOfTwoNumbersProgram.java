package Manasa.com;
import java.util.Scanner;
public class HCFOfTwoNumbersProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value ");
        int num1=input.nextInt();
        System.out.println("enter the second value");
        int num2=input.nextInt();
        int i=1;
        while(i>0){
            if(num1%i==0&num2%i==0){

            }
            i++;
            System.out.println("hcf of given numbers is "+i);
        }

    }
}
