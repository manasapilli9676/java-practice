package Manasa.com;
import java.util.Scanner;
public class OddEvenReturntype {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean ans=odeven(num);
        if(ans){
            System.out.println("number is even ");
        }
        else{
            System.out.println("number is odd ");
        }

    }
    static boolean odeven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
