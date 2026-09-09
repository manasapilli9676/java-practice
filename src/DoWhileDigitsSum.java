import java.util.Scanner;
public class DoWhileDigitsSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value;
        int rem=0;


        do {
            value = input.nextInt();
            int num=value;
            int sum=0;//remember here mansa that  if  ypu want to resent the  sum value  so  you must  place the  value with in the  out side the loop
            while (num > 0){
                rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }
            System.out.println(sum);
        }while(value!=0);

    }
}
