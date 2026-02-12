package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int[] candies=new int[x];
        int extracandies=input.nextInt();
        for(int i=0;i<x;i++){
            candies[i]=input.nextInt();
        }
        int greater=candies[0];
        int i=0;
        while(x>candies.length-1){
            if(candies[i]+extracandies>=greater){
                System.out.println(Arrays.toString(candies));
            }

        }
    }
}
