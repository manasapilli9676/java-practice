package Manasa.com;
import java.util.Scanner;
public class CalculateCGPAJavaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of subjects ");
        int total_subjects = input.nextInt();
        System.out.println("grade points i scored acording the given subjests");
        int i=1;
        int sum=0;
        while(i<=total_subjects){
            int gradepoints=input.nextInt();
            sum=sum+gradepoints;
            i++;

        }
        if(total_subjects!=0) {
            int CGPA = sum / total_subjects;
            System.out.println(CGPA);
        }
        else {
            System.out.println("subjects are 0");
        }



    }
}
