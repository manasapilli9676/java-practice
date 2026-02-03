//package Manasa.com;
//import java.util.Scanner;
//import java.util.Arrays;
//public class BuildArrayfromPermutation {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("size of array");
//        int x=input.nextInt();
////        int y=input.nextInt();
//        int[] arr=new int[x];
//        int[] ans=new int[x];
////        int[] arr1=new int[y];
//        System.out.println("let give the index values");
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = input.nextInt();
//        }
////            for(int i=0;i<arr.length;i++){
//////                System.out.println(Arrays.toString(arr));
////
////        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(ans));
//
//
//
package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Size of array:");
        int x = input.nextInt();

        int[] arr = new int[x];
        int[] ans = new int[x];

        System.out.println("Enter permutation values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Build Array from Permutation logic
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }


        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Built array: " + Arrays.toString(ans));
    }
}
