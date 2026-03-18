//package Manasa.com;
//import java.util.Arrays;
//public class Sortedrotatedarray {
//    public static void main(String[] args) {
//        int[] arr={3,4,5,6,7,1,2};
//        int ans=search(arr);
//        System.out.println(ans);
//        //it is not for duplicate arr
//
//    }
//    static int search(int[] arr){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            //four cases we can see here
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(mid>start&&arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]<=arr[start]){
//                end=mid-1;
//            }else{
//                start=mid+1;
//            }
////            if(arr[mid]>=arr[end]){
////                start=mid;
////            }
////            else{
////                end=mid-1;
////            }
//        }
//        return -1;
//    }
//}
package Manasa.com;
import java.util.Arrays;
public class Sortedrotatedarray {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,1,2};
        int ans=search(arr);
        System.out.println(ans);
    }
    static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return (start-1+arr.length)%arr.length;
    }
}