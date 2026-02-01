package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class TwodArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] num=new int[3][3];
        System.out.println(num.length);
        for(int row=0;row<num.length;row++){
            for(int col=0;col<num[row].length;col++){
                num[row][col]=input.nextInt();
            }

        }
//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//                {65,6,57},
//        };
        System.out.println(Arrays.toString(num));

    }
}
