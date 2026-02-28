package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
    int[] arr=new int[x];
    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
    }
        System.out.println(Arrays.toString(arr));
    }
}
