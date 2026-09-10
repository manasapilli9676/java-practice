import java.util.Scanner;
public class ForLoopPerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        int n=value;
        int sum=0;
        for(int i=1;i<n;i++) {

            if (n%i==0){
                sum=sum+i;
            }
        }
        if(sum==value){
            System.out.println(value+"is the perfect number  ");
        }else{
            System.out.println("input is not a perfect number ");
        }
//        System.out.println(n+"is the perfect number ");
    }
}
