import java.util.Scanner;
public class DoWhileEvenSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int sum=0;
        int count=0;
        do{
            num=input.nextInt();
            if(num!=0){
                if(num%2==0) {
                    sum = sum + num;
                    count++;
                }
            }
        }while(num!=0);
        System.out.println(sum);
        System.out.println(count);
    }
}
