package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class ConcatenationofArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] arr=new int[x];

        int[] ans=new int[2*x];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<x;i++){
            ans[i]=arr[i];
        }
        for(int i=0;i<x;i++){
            ans[i+x]=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

    }
}
