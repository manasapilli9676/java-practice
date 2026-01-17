package Manasa.com;
import java.util.Scanner;
public class JavaProgramVowelOrConsonant {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter the charecter");
        char x = input.next().charAt(0);

        if (x == 'a'||x=='e'||x=='i'||x=='o'||x=='u') {
            System.out.println("given input is consonant ");
        }
        else{
            System.out.println("given input is consonant");
        }

    }
}