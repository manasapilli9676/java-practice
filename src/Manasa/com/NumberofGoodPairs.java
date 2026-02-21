package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class NumberofGoodPairs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] arr1=new int[x];
//        int[] arr2=new int[x];
        for(int i=0;i<x;i++){
            arr1[i]=input.nextInt();

        }
//        for(int j=0;j<x;j++){
//            arr2[j]=input.nextInt();
//        }
        int count=0;
//        int i=0;
//        int j=0;
        for(int i=0;i<x;i++) {
            for(int j=i+1;j<x;j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
