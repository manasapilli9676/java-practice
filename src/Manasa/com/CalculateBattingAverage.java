package Manasa.com;
import java.util.Scanner;
public class CalculateBattingAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("number of runs scored ");
        int runs=input.nextInt();
        System.out.println("number of times out ");
        int outs=input.nextInt();

        if(outs!=0) {
            float BattingAverage=runs/outs;
            System.out.println("Calculate Batting Average\n" + BattingAverage);
        }
            else{
                System.out.println("nothing");
            }



    }
}
