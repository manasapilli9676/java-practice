package Manasa.com;
import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string to print reverse");
        String name = input.next();
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println("reverse string "+reverse);

    }


}
