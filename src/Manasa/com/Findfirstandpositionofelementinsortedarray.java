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
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
                if(target==arr[])
            }
        }
    }
}
