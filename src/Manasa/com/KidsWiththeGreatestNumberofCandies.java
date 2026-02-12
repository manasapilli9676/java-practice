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
        int greater =candies[0];
        for(int i=0;i<x;i++) {
            if (candies[i] >= greater) {
                greater = candies[i];
            }
        }

       for(int i=0;i<x;i++){
            if (candies[i] + extracandies > greater) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
