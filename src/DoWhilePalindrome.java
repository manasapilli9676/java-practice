import java.util.Scanner;
public class DoWhilePalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        do{
            num=input.nextInt();
            int value=num;

            if(value!=0){
                int ans=0;
                while(value>0) {
                    int rem = value % 10;
                    ans = ans * 10 + rem;
                    value=value/10;
                }
                if(ans==num){
                    System.out.println("the given number is a palindrome");
                }else{
                    System.out.println(" given number is not a palindroke");
                }
            }

        }while(num!=0);
    }
}
