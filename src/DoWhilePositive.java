import java.util.Scanner;
public class DoWhilePositive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        do{
             num=input.nextInt();
            if(num>0){
                System.out.println("given number is positive");
            }else if(num<0){
                System.out.println("given number is negative");
            }else{
                System.out.println("program ends");
            }
        }while(num!=0);


    }
}
