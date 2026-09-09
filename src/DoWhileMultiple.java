import java.util.Scanner;
public class DoWhileMultiple {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int count=0;
        do{
            num=input.nextInt();
            if(num!=0){
                if(num%5==0){
                    count++;
                }
            }
        }while(num!=0);
        System.out.println(count);
    }
}
