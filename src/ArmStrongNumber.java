import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int value=num;
        int sum=0;
        while(value>0){
            int rem=value%10;
            sum=sum+(rem*rem*rem);
            value=value/10;
        }
        if(sum==num){
            System.out.println("given number is a armstrong");
        }
    }
}
