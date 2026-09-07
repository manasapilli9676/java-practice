import java.util.Scanner;
public class WhileSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int i=1;
        int value=0;
        int ans=value;
        while(i<=num){

            ans=ans+i;
            i++;
        }
        System.out.println(ans);
    }
}
