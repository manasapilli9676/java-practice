import java.util.Scanner;
public class UserInputPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the name");
        String name=input.nextLine();
        System.out.println("enter the age");
        int age=input.nextInt();
        System.out.println("enter the marks");
        int marks=input.nextInt();
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);
    }
}
