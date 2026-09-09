import java.util.Scanner;
public class DoWhileAverage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int sum=0;
        int count=0;
        do{
            num = input.nextInt();
            if(num!=0) {
                sum = sum + num;
                count++;
            }
        }while(num!=0);
        double average=(double)sum/count;
        System.out.println(average);
    }
}
