import java.util.Scanner;
public class DoWhileReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value;


        do{
            value = input.nextInt();
            if(value!=0) {
                int num=value;
                int ans=0;
                while (num > 0) {
                    int rem = num % 10;
                    ans = ans * 10 + rem;
                    num = num / 10;
                }
                System.out.println(ans);
            }
        }while(value!=0);

    }
}
