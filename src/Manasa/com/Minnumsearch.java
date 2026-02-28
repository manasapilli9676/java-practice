package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;

public class Minnumsearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of arr");
        int x=input.nextInt();

        int[] arr=new int[x];
        System.out.println("enetr the input values");
                for(int i=0;i<arr.length;i++){
                    arr[i]=input.nextInt();
                }

                int ans=search(arr);
        System.out.println(ans);
    }
    static int search(int[] arr){
        int max=arr[0];
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
               max=arr[i];
            }
            return i;
        }
        return -1;
    }
//    return -1;
}
