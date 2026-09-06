import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        int age=input.nextInt();
        input.nextLine();
        String branch=input.nextLine();
        int Marks=input.nextInt();
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("branch:"+branch);
        System.out.println("Marks:"+Marks);
    }
}

