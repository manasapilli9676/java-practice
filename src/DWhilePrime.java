import java.util.Scanner;
public class DWhilePrime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        do{
            num=input.nextInt();
            int i=1;
            int count=0;
            while(i<=num) {
                if (num % i == 0) {
                    count++;

                }
                i++;
            }
                if(count==2){
                    System.out.println("number is a prime");
                }else if(count>0){
                    System.out.println("number is not a prime");
                }

        }while(num!=0);
    }
}
