package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
//searching an element in the array
public class findinmountainarray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,4,3,2,0};
        int target=3;
        findinmountainarray obj=new findinmountainarray();
        int result = obj.search(arr, target);
        System.out.println("Element found at index: " + result);


    }
     int search(int[] arr,int target){
        int peak=peakindexoftheelement(arr);
        int firstTry=orderagnostic(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderagnostic(arr,target,peak+1,arr.length-1);
    }
    static int peakindexoftheelement(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    static int orderagnostic(int[] arr, int target,int start,int end) {
//        int start = 0;
//        int end = arr.length - 1;
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
