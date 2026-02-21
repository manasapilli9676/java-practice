package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;
        int x=input.nextInt();
        int[] arr1=new int[x];
        int count=0;
        //int[] arr1[0]=0;
        for(int i=0;i<x;i++) {
            for(int j=0;j<x;j++){
            if (arr1[i]<arr1[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
