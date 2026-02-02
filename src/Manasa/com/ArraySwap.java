package Manasa.com;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,56,6};
//        int[] arr2={23,4,45,6,7,78};
        swap(3,4,arr1);

        System.out.println(Arrays.toString(arr1));

    }
    static void swap(int index1,int index2,int[] arr1){
       int temp=index1;
       index2=index1;
       temp=index2;

    }
}
