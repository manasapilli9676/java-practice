import java.util.Scanner;
public class ForLoopPrime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("given number is prime");
            }else{
                System.out.println("given number is not a prime");
            }

    }
}
