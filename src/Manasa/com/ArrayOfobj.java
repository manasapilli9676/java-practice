package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayOfobj {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        int[] arr=new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=input.nextInt();
//
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//
        String[] str=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=input.next();
        }
//        str[1]="paru";
        System.out.println(Arrays.toString(str));
        str[1]="paru";
        System.out.println(Arrays.toString(str));


    }
}
