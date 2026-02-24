package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //search in the array return the index if the element is found
        //other wise if the element is not found return the -1;
        int x=input.nextInt();
        int[] arr=new int[x];
        int required =input.nextInt();
        for(int i=0;i<x;i++){
            arr[i]=input.nextInt();

        }

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
