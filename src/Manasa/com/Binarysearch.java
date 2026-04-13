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
        System.out.println("enter the size of array");
         int x=input.nextInt();
         int[] arr=new int[x];
        System.out.println("enter the values");
         for(int i=0;i<arr.length;i++){
             arr[i]=input.nextInt();
         }
        System.out.println("give the elment to find the value");
         int target =input.nextInt();
        int ans= binarysearchh(arr,target);
        System.out.println("the required value index is "+ans);
    }

    static int binarysearchh(int[] arr, int target){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            //fin the middle element
            //int mid=(start+end)/2;  it may give us an eroor because start + end may give big value so
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;

            }

        }
        return -1;
    }
}
//if the
