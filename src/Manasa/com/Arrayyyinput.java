package Manasa.com;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayyyinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
//        arr[0]=2;
//        arr[1]=3;
//        arr[2]=4;
//        arr[3]=5;
//        arr[4]=6;
//////        System.out.println(arr[4]);
//int i;
        for( int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();

            System.out.println(arr[i]);
        }
////        for(int i=0;i<arr.length;i++) {
//                    System.out.print(arr[i] + "  " );
////        }
//        for(int num:arr){;//num represent the  element of array
//            System.out.println(num);//
//        }
//        String[] str=new String[4];
//for(int i=0;i<str.length;i++){
//    str[i]=input.next();
//}
//        System.out.println(Arrays.toString(str));

    }
}
