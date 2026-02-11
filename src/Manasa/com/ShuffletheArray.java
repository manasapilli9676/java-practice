package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class ShuffletheArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int[] arr1=new int[x];
        int[] arr2=new int[x];
        int[] shuffle=new int[2*x];
        System.out.println("enter arr1 values");
        for(int i=0;i<x;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("enter arr2 values");
        for(int j=0;j<x;j++) {
            arr2[j] = input.nextInt();
        }
            int i=0;
            int j=0;
            int k=0;

            while(i<x&&j<x){
                shuffle[k]=arr1[i];
                k++;
                i++;
                shuffle[k]=arr2[j];
                k++;
                j++;
            }
        System.out.println(Arrays.toString(shuffle));
    }
}
