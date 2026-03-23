package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class Smallestlettergreaterthantarget  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of arr");
        int x=input.nextInt();
       char[] arr=new char[x];

        System.out.println("give the inputs");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.next().charAt(0);
        }
        System.out.println("enter the target value");
        char target=input.next().charAt(0);
        char result=target(arr,target);
        System.out.println(result);
    }
    static char target(char[] arr,char target){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return arr[low%arr.length];
    }
}
