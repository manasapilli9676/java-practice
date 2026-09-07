import java.util.Scanner;
public class TernarypositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        System.out.println(x>0?"x is positive":x<0?"x is negative":"x is zero");
    }
}
