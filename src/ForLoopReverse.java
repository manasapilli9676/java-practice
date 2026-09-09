import java.util.Scanner;
public class ForLoopReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int ans=0;
        for(int i=0;num>0;i++){
            int rem=num%10;
            ans=ans*10+rem;//here the  entire solution must not depend on the i value and and  replace as num>0
            num=num/10;
        }
        System.out.println(ans);
    }
}
