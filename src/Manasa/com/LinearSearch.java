package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //search in the array return the index if the element is found
        //other wise if the element is not found return the -1;
        System.out.println("size of the array");
        int x=input.nextInt();
        System.out.println("enter the values");
        int[] arr=new int[x];

        for(int i=0;i<x;i++){
            arr[i]=input.nextInt();

        }
        System.out.println("enter the required value");
        int required =input.nextInt();

       int ans= linearsearch(arr,required);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int required){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==required){
                return i;
            }
        }
        return -1;
    }

}
