package Manasa.com;
import java.util.Scanner;

public class PrimeFunction {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        prime(num1, num2);   // function call
    }

    static void prime(int num1, int num2) {

        for (int i = num1; i <= num2; i++) {

            if (i <= 1)
                continue;

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
