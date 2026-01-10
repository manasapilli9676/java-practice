package Manasa.com;
import java.util.Scanner;
public class DoWhile
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int num=input.nextInt();
        int i=1;
        do
        {
            System.out.println(num);
        }
        while(i!=1);
        {
            System.out.println(i);
            i++;
        }
    }
}

