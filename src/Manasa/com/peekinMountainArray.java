package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class peekinMountainArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           int x=input.nextInt();
           //for binary search array must be sorted
        //no dublicate array
        int[] arr=new int[x];
        for(int i =0;i<arr.length;i++){
//
        }

    }
    //in the end start and end point to the same value
    static int sorted(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                //you are in tje decesing part of array
                end=mid;
            }
        }
        return start;
        //where the start==end at the end of the array search so
    }

//    }
}
