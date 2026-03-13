package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;

public class Findfirstandpositionofelementinsortedarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of arr");
        int x=input.nextInt();
        int[] arr=new int[x];
        System.out.println("enter the input values ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter the target element");
        int target=input.nextInt();


    }
    //manager method
    public int[] searchrange(int[] arr,int target){
      int[] ans={-1,-1};
      int start=search(arr,target,true);
      int end=search(arr,target,false);
      ans[0]=start;
      ans[1]=end;
      return ans;
    }
    //worker method
    int search(int[] arr,int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //potential answer is found
                ans=mid;
                if(findstartindex){
                    end=mid-1;

                }else{
start=mid+1;
                }
            }
        }
        return ans;
    }
}
