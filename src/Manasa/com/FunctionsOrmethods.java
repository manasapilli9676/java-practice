//print sum of two numbers
 package Manasa.com;
import java.util.Scanner;
public class FunctionsOrmethods {
    public static void main(String[] args) {
sum();
    }
    static void sum(){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is "+sum);
    }
    /*return_type name(){
     //body
     return statement;
     }
    */
}
