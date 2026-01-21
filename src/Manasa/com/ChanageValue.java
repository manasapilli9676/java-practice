package Manasa.com;
import java.util.Arrays;
public class ChanageValue {
    public static void main(String[] args) {
        int[] arr={2,3,4,4,5,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=87;
    }
}
