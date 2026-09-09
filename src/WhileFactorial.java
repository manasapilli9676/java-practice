import java.util.Scanner;
public class WhileFactorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int factorial=1;
        int i=1;
        while(i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
