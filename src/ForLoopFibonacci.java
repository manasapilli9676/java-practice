import java.util.Scanner;
public class ForLoopFibonacci {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        for (int i=0;i<num;i++) {
            int next=a+b;
            a = b;
            b = next;
            System.out.println(next);
        }

    }
}
