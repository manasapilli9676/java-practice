import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int value=input.nextInt();
        if(value>0){
            System.out.println("positive");
        }else if(value<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}
