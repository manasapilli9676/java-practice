import java.util.Scanner;
public class ForLoopSumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        for(int i=1;n>0;i++){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
