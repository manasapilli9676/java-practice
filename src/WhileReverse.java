import java.util.Scanner;
public class WhileReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int ans=0;
        int i=1;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
            i++;
        }
        System.out.println(ans);
    }
}
