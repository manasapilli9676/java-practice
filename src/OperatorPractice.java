import java.util.Scanner;
public class OperatorPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first value");
        int num1=input.nextInt();
        System.out.println("enter the second value");
        int num2=input.nextInt();
        int addition=num1+num2;
        System.out.println("addition:"+addition);
        int subtraction=num1-num2;
        System.out.println("subtraction:"+subtraction);
        int multiplication=num1*num2;
        System.out.println("multiplication:"+multiplication);
        int division=num1/num2;
        System.out.println("division:"+division);
        int remainder=num1%num2;
        System.out.println("remainder:"+remainder);
    }
}
