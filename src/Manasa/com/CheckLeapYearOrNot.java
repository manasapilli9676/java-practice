package Manasa.com;
import java.util.Scanner;
public class CheckLeapYearOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        if(year%400==0){
            System.out.println("given year is leap year ");
        }
        else if(year%4==0&&year%100!=0){
            System.out.println("given year is leap year ");
        }
        else{
            System.out.println("given number is not a leap year ");
        }
    }
}
