package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class RunningSumofonedArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int x=input.nextInt();
        int[] arr=new int[x];
        int[] sum=new int[x];
        int summ=0;
        for(int i=0;i<x;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<x;i++){
            summ=summ+arr[i];
            sum[i]=summ;
        }
//        System.out.println(Arrays.toString(sum));
        System.out.println(summ);
    }
}
