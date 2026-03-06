package Manasa.com;
import java.util.Scanner;
/*
* algorithm
* 1.find the middle element
* 2.taget>mid  if search int hte right
* else in left
* if target==mid
* */
import java.util.Arrays;
public class Binarysearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int x=input.nextInt();
         int[] arr=new int[x];
         for(int i=0;i<arr.length;i++){
             arr[i]=input.nextInt();
         }
         int target =input.nextInt();

    }
    static int binarysearchh(int[] arr, int target){
//        int search=arr[i];
//        int mid=(0+arr.length-1)/2;
        for(int i=0;i<arr.length;i++){
            int search=arr[i];
            int mid=(0+arr.length-1)/2;
            if(arr[mid]>search){
                for(int x=mid;x<arr.length;x++){
                    search=arr[x];
                }
            }
        }
        return search;
    }
}
