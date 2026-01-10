package Manasa.com;
import java.util.Scanner;
public class CalculateAverageOfnNumbers
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=1;
        int sum=0;
        float average=0;
        int count=0;
        while(x>0){
           x=input.nextInt();
           if(x>0) {
               sum = sum + x;
               count++;
           }
        }
        if(count>0) {
            average = sum / count;
        }
        System.out.println("average of given numbers is "+average );
    }
}
