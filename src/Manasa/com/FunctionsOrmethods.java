//print sum of two numbers
//return type basically call the return type block
 package Manasa.com;
import java.util.Scanner;
public class FunctionsOrmethods {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);
//sum();
//sum();
//    }
//    static void sum(){
//        Scanner input=new Scanner(System.in);
//        int num1=input.nextInt();
//        int num2=input.nextInt();
//        int sum=num1+num2;
//        System.out.println("the sum is "+sum);
//    }
//    /*return_type name(){  return
//     //body
//     return statement;
//     }
//    */

    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum= num1 + num2;
        return sum;//here the statement traverse will break
       // System.out.println("no more statement will execuite here");
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);
    }
}
