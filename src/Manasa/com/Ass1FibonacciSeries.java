package Manasa.com;
import java.util.Scanner;
public class Ass1FibonacciSeries {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("enter the number of fibonacciseries required");
int n=input.nextInt();
int Firstnum=0;
int Secondnum=1;
int nextnum=n;
int i;

        for(i=0;i<=n;i++){
            System.out.print(+Firstnum +",");
            nextnum=Firstnum+Secondnum;
            Firstnum=Secondnum;
            Secondnum=nextnum;


        }


    }
}
