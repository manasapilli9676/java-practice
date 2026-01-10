package Manasa.com;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);//imp
        int rollno=input.nextInt();
        System.out.println("your roll no is " + rollno );
        String name=input.next();
        System.out.print("my nameis "+name);
        float marks=input.nextFloat();
        System.out.println("i got "+marks+"marks");
        input.nextBoolean();
        System.out.println("manasa"+true);

    }

}
