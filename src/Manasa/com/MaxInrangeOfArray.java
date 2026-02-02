package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class MaxInrangeOfArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int start=input.nextInt();
        int last=input.nextInt();
        int[] arr={1,2,9,4,5,6,7};
        System.out.println(MaxRange(arr,start,last));
    }
    static int MaxRange(int[] arr,int start,int last){
        int maxval=arr[start];
        for(int i=start;i<last;i++){
            if(arr[i]>maxval){
                maxval=arr[i];

            }
        }
        return maxval;
    }
}
