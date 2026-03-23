package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class InfinitenumberSearch{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={2,3,4,5,6,7,8,9,45,67,78,98,245,6758,7988};
        int target=78;
        int anss=targeeet(arr,target);
        System.out.println(anss);
    }
    static int targeeet(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            //double the box size
            //end=previous end+(sizeofbox)*2;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return binarysearch(arr,target,start,end);

    }
    static int binarysearch(int[] arr,int target,int start,int end){
//        int start=0;
//        int end=arr.length-1;
        while(start<=end){
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
