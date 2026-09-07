import java.util.Scanner;
public class CountEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=1;
        int num=input.nextInt();
        int counteven=0;
        int countodd=0;
        while(i<=num){
            if(i%2==0){

                counteven++;

            }else{
                countodd++;

            }
            i++;
        }
        System.out.println("number of even numbers are:"+counteven);
        System.out.println("number of odd numbers are:"+countodd);

    }
}
