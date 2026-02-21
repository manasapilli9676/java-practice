package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;
        int x=input.nextInt();
        int[] arr1=new int[x];
int i=0;
//        int count=0;
        for(i=0;i<x;i++) {
            arr1[i]=input.nextInt();
        }
        //int[] arr1[0]=0;
        for( i=0;i<x;i++) {

            int count=0;
            for(int j=0;j<x;j++){
                if(i!=j) {
                    if (arr1[i] > arr1[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
//        System.out.println(count);
    }
}
