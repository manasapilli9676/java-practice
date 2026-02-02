package Manasa.com;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,56,6};
//        int[] arr2={23,4,45,6,7,78};
//        swap(arr1,3,4);
//        reverse(arr1,0,4);
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    static void reverse(int[] arr1){
         int start=0;
        int end=arr1.length-1;
        while(start<end){
            swap(arr1,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr1,int index1,int index2){
       int temp=arr1[index1];
       arr1[index1]=arr1[index2];
       arr1[index2]=temp;

    }
}
