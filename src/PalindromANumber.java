import java.util.Scanner;
public class PalindromANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
       int num=value;
        int ans=0;

        while(num>0){
           int rem=num%10;
           ans=ans*10+rem;
           num=num/10;

        }
        if(value==ans){
            System.out.println("given number is a palindrome");
        }else{
            System.out.println("given number is not a palindrome");
        }
    }
}
