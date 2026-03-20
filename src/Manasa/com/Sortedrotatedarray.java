package Manasa.com;
import java.util.Arrays;
public class Sortedrotatedarray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(pivote(arr));
        int target=
    }
    //here for finding the target element we are using 5 approaches so
    //first one is find pivote elemet using it we can solve by two cases
    static int search(int[] arr,int target,int start,int end){
        int pivot=pivote(arr);
        //if you didnot find sthe pivote
        if(pivot==-1){
            //just do normal binary search
            return binarysearch(arr,target,start,end);
        }
        //if pivot is found you have found 2 asc sorted arrays
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>arr[start]){
            return binarysearch(arr,target,0,pivot-1);
        }else{
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }
    }
    static int binarysearch(int[] arr,int target,int start,int end){

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }else if(arr[mid]<target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int pivote(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //here mid
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
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