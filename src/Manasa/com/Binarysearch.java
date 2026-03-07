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
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            //fin the middle element
            //int mid=(start+end)/2;  it may give us an eroor because start + end may give big value so
            int mid=start+(end-start)/2;
            if(target<mid){
                end=mid-1;

            }
            else if(target>mid){
                start=mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
