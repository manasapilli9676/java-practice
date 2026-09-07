import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int ans=0;
        int i=1;
        int count=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10+rem;
            num=num/10;
            count++;
            i++;
        }
        System.out.println(ans);
        System.out.println(count);
    }
}
