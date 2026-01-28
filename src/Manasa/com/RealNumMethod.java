package Manasa.com;
import java.util.Scanner;
public class RealNumMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        realnum(n);

    }
    static void realnum(int num){
        int i=1;
        for( i=1;i<=num;i++){
            System.out.println(i);

        }

    }
}
