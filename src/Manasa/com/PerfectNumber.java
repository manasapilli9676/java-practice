package Manasa.com;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int i=1;
        int next=0;
        while(i<num){
            if(num%i==0){
                next=next+num;
            }
        }
        if(next==num){
            System.out.println("given number is perfect number ");
        }
        else {
            System.out.println("given number is not a perfect number ");
        }
    }
}
