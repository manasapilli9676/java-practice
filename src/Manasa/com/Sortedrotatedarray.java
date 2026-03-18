package Manasa.com;
import java.util.Arrays;
public class Sortedrotatedarray {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,1,2};
        int ans=search(arr);
    }
    static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=start;
            }
        }
        return start;
    }
}
