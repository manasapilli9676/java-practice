package Manasa.com;
import java.util.Scanner;
public class Ass1largestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give the first input");
        int Firstnum =input.nextInt();
        System.out.println("the first num is "+Firstnum);
        System.out.println("give the second input");
        int Secondnum=input.nextInt();
        System.out.println("the second num is "+Secondnum);
        if(Firstnum>Secondnum)
        {
            System.out.println("Firstnum is greatest num among two num "+Firstnum);

        }
        else {
            System.out.println("secondnum is greater num among two num "+Secondnum);
        }
    }
}
