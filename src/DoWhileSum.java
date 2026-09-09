import java.util.Scanner;
public class DoWhileSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int sum=0;
        do{
            num=input.nextInt();
            sum=sum+num;
        }while(num!=0);
        System.out.println(sum);
    }
}
