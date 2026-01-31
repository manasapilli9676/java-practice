package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFunctions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        change(arr);
    }

    static void change(int[] arr){
        arr[0]=3;
        arr[1]=32;
        arr[2]=44;
        arr[3]=56;
        arr[4]=435;

        System.out.println(arr[2]);
    }
}
