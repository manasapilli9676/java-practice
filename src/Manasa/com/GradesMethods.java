package Manasa.com;
import java.util.Scanner;
public class GradesMethods {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();

        String result=grade(marks);
        System.out.println(result);
    }
    static String grade(int marks){
        if(marks<=100&&marks>=91){
            return "AA";
        }
        else if(marks<=90&&marks>=81){
            return "AB";

        }
        else if(marks<=80&&marks>=71){
            return "BB";

        }
        else if(marks<=70&&marks>=61){
            return "BC";

        }
        else if(marks<=60&&marks>=51){
            return "CD";

        }
        else if(marks<=50&&marks>=41){
            return "DD";

        }
        else {
            return "fail";
        }
    }
}
