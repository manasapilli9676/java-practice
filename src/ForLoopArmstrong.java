import java.util.Scanner;
public class ForLoopArmstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        int n=value;
        int sum=0;
        for(int i=0;n>0;i++){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
       if(value==sum){
           System.out.println("given number is armstrong");
       }else{
           System.out.println("given number is not a armstrong");
       }
    }
}
