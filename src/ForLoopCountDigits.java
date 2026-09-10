import java.util.Scanner;
public class ForLoopCountDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        for(int i=0;num>0;i++){
            int rem=num%10;
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
