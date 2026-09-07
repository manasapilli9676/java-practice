import java.util.Scanner;
public class TerenaryPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //instead of  if condition we are using this operation
        //condition?value_if_true : value_if_False
        int num=input.nextInt();
        System.out.println( num%2==0?"num is even":"num is odd");
    }
}
