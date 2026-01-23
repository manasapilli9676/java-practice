package Manasa.com;
import java.util.Scanner;
public class MinMaxReturnType {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int maximum=max(num1,num2,num3);
        int minimum=min(num1,num2,num3);
        System.out.println("maximum number is "+maximum);
        System.out.println("minimum number is "+minimum);
    }
    static int max(int num1,int num2,int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }
        else if (num2 > num3){
            return num2;
        }
        else{
            return num3;
        }

    }
    static int min(int num1,int num2,int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
