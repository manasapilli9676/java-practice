import java.util.Scanner;
public class DoWhileFactorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        do{
            num=input.nextInt();
            int i=1;
            int factorial=1;
            if(num!=0) {
                while (i <= num) {
                    factorial = factorial * i;
                    i++;
                }

               // System.out.println(factorial);
            }
            System.out.println(factorial);
        }while(num!=0);
    }
}
