package Manasa.com;
import java.util.Scanner;
public class VoteEligible {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age ");
        int age=input.nextInt();
        vote(age);

    }
    static void vote(int age){
        if(age>=18){
            System.out.println("he/she eligible for vote ");
        }
        else{
            System.out.println("he/she not eligible for vote ");
        }
    }
}
