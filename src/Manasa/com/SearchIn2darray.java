package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2darray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr={
                {1, 2, 3, 4 },
                {12,45,64,65},
                {43,54,76,34},

        };
        int target=64;
    }
     static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
