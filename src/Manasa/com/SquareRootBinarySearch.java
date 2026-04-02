package Manasa.com;

import java.util.Scanner;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double result = sqrtBinarySearch(num);
        System.out.println("Square root of " + num + " is: " + result);
    }
    public static double sqrtBinarySearch(int num) {
        double low = 0;
        double high = num;
        double mid = 0;
        double precision = 0.00001;

        while ((high - low) > precision) {
            mid = (low + high) / 2;

            if (mid * mid == num) {
                return mid;
            } else if (mid * mid < num) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return mid;
    }
}
