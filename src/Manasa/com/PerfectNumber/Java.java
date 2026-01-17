package Manasa.com.PerfectNumber;
import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int i=1;
        int next=0;
        while(i<num){
            if(num%i==0){
                System.out.println(i);
            }
            next=next+i;
        }
            if(next==num){
                System.out.println("the given number is perfect number");
            }
            else {
                System.out.println("given number ics not a perfect number");
            }
        }

    }

