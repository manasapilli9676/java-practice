package Manasa.com;
//find even number of digits in a given number of digits
import java.util.Scanner;
import java.util.Arrays;
public class FindEvenNumberofdigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] arr=new int[x];
        for(int i=0;i < arr.length;i++){
            arr[i]=input.nextInt();
        }
    }
    static int finding(int[] arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
     }
static boolean even(int num){
        int numberofDigits=digits(num);
        /*
        if(numberofDigits%2==0){
        return true;
        }
        return false;
        }
       */
        return numberofDigits%2==0;
}
static int digits(int num){
        if(num<0){
            num=num*-1;

        }
        if(num==0){
            return 0;
        }
}
}