package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int element=input.nextInt();
        int start=input.nextInt();
        int end=input.nextInt();
    int[] arr=new int[x];

    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
    }
//        System.out.println(Arrays.toString(arr));

    }
    static int searchinrange(int[] arr,int element,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(element==arr[i]){
                return i;
            }

        }
        return -1;
    }
}
