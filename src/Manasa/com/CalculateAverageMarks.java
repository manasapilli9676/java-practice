package Manasa.com;
import java.util.Scanner;
public class CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of subjects");
        int subjects=input.nextInt();
        int i=1;
        int count=0;
        int sum=0;
        System.out.println("enter the marks");
        for(i=1;i<=subjects;i++){
          int num=input.nextInt();
            sum=sum+num;
            count++;
        }
        if(count!=0){
            int average=sum/count;
            System.out.println(average);
        }
        else{

        }

    }
}
