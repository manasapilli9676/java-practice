import java.util.Scanner;
public class WhileFibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0;
        int b=1;
        int i=1;
        System.out.println(a);

        while(i<n){
            int next=a+b;
            a=b;
            b=next;
              i++;
            System.out.println(next);
        }
    }
}
