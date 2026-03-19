package Manasa.com;
import java.util.Arrays;
public class Sortedrotatedarray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        System.out.println(search(arr));
    }

    static int search(int[] arr, int target) {
        int pivot = search(arr);
        //if you do not find a pivote,it means the array is not rotated
        if (pivot == -1) {
            return binarysearchh(arr, target, 0, arr.length - 1);
        }
        //if pivote is found you have found 2 asc sorted arrays

        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarysearchh(arr, target, 0, pivot - 1);
        }
        return binarysearchh(arr, target, pivot + 1, arr.length - 1);
    }

    //just do normal binary search
    static int binarysearchh(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //fin the middle element
            //int mid=(start+end)/2;  it may give us an eroor because start + end may give big value so
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            //four cases we can see here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] >= arr[end]) {
                start = mid;
            } else {
                end = mid - 1;
//
            }


        }
        return -1;
    }
}

//package Manasa.com;
//import java.util.Arrays;
//public class Sortedrotatedarray {
//    public static void main(String[] args) {
//        int[] arr={3,4,5,6,7,1,2};
//        int ans=search(arr);
//        System.out.println(ans);
//    }
//    static int search(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            int mid= start+(end-start)/2;
//            if(arr[mid]>arr[end]){
//                start=mid+1;
//            }else{
//                end=mid;
//            }
//        }
//        return (start-1+arr.length)%arr.length;
//    }
//}