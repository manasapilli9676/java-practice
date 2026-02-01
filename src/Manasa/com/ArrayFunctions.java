package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFunctions {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] nums={2,3,4,5,6,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] nums){
//        arr[0]=3;
//        arr[1]=32;
//        arr[2]=44;
//        arr[3]=56;
//        arr[4]=435;
//
//        System.out.println(arr[2]);
        nums[3]=20;
    }
}
