package Manasa.com;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int ans=add(num1,num2);
        System.out.println("sum of two numbers"+ans);

    }
    static int add(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }


}
