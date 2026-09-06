import java.util.Scanner;
public class EvenOddPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value");
        int value=input.nextInt();
        if(value%2==0){
            System.out.println("value is even");
        }else{
            System.out.println("value is odd");
        }
    }
}
