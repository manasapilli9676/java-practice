package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class OrderAgnostics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int x = input.nextInt();
        System.out.println("enter the values");
        {
            int[] arr = new int[x];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println("enter the target element");
            int target = input.nextInt();
            int ans = orderagnostic(arr, target);
            System.out.println("the index value of the target element" + ans);
        }
    }

    static int orderagnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//        if(arr[start]>arr[end]) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
            if (arr[start] < arr[end]) {
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if(arr[mid]==target) {
                        return mid;
                    }
                    if (target > arr[mid]) {
                        start = mid +1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
             else {
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if(arr[mid]==target) {
                        return mid;
                    }
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
//                    if(arr[mid]==target) {
//                        return mid;
//                    }
                }

            }

//        }
        return -1;
    }
}
