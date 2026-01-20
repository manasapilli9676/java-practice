package Manasa.com;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        int ans=sum1();
        System.out.println(ans);

    }
    static int sum1(){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static void sum(){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
}
