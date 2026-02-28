package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("size of the array");
        int x=input.nextInt();

        System.out.println("enter the starting index");
        int start=input.nextInt();
        System.out.println("enter the ending array");
        int end=input.nextInt();
    int[] arr=new int[x];
        System.out.println("enter the input values");
    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
    }
        System.out.println("enter the search element");
        int element=input.nextInt();
//        System.out.println(Arrays.toString(arr));
        int ans=searchinrange(arr,element,start,end);
        System.out.println(ans);

    }
    static int searchinrange(int[] arr,int element,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(element==arr[i]){
                return 0;
            }

        }
        return -1;
    }
}
