package Manasa.com;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,56,6};
//        int[] arr2={23,4,45,6,7,78};
        swap(arr1,3,4);

        System.out.println(Arrays.toString(arr1));

    }
    static void swap(int[] arr1,int index1,int index2){
       int temp=arr1[index1];
       arr1[index2]=arr1[index1];
       temp=arr1[index2];

    }
}
