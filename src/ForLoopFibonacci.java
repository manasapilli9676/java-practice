import java.util.Scanner;
public class ForLoopFibonacci {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int a = 0;
        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
        for (int i=0;i<num-2;i++) {
            System.out.println(a);
            int next=a+b;
            a = b;
            b = next;
            System.out.println(next);
        }

    }
}
