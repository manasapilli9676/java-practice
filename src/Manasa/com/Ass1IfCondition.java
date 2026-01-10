package Manasa.com;

public class Ass1IfCondition {
    public static void main(String[] args) {
        int i=7;
        int j=6;
        if(i<6)
        {
            int result=i+j;
            System.out.println("add two numbers "+result);
        }
        else if(i%2==0){
            int result1=i-j;
            System.out.println("sub two number "+result1);
        }
        else if(i!=6){
            int result2=i*j;
            System.out.println("mult of two number "+result2);
        }
        else {
            int result3=i/j;
            System.out.println("div of two numbers "+result3);
        }
    }
}
//import java.util.Scanner;
//
//public class IfCondition {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter first number:");
//        int a = input.nextInt();
//
//        System.out.println("Enter second number:");
//        int b = input.nextInt();
//
//        System.out.println("Enter operator (+, -, *, /):");
//        char op = input.next().charAt(0);
//
//        if (op == '+') {
//            System.out.println("Result = " + (a + b));
//        }
//        else if (op == '-') {
//            System.out.println("Result = " + (a - b));
//        }
//        else if (op == '*') {
//            System.out.println("Result = " + (a * b));
//        }
//        else if (op == '/') {
//            System.out.println("Result = " + (a / b));
//        }
//        else {
//            System.out.println("Invalid operator");
//        }
//
//        input.close();
//    }
//}

