package Manasa.com;
import java.util.Scanner;
public class VoteEligibleReturnType {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age = input.nextInt();
    boolean ans=eligible(age);
    if(ans){
        System.out.println("he/she eligible for vote");
    }
    else{
        System.out.println("not eligible for vote ");
    }
    }
    static boolean eligible(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }

}
