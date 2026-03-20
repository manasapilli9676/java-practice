package Manasa.com;
import java.util.Arrays;
public class Sortedrotatedarray {
    public static void main(String[] args) {

    }
    //here for finding the target element we are using 5 approaches so
    //first one is find pivote elemet using it we can solve by two cases
    static int pivote(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[start]){

            }
        }
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