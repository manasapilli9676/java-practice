package Manasa.com;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        int ans=sum2(2,4);
        System.out.println(ans);

    }
    //pass the value of number when  you are calling the method in main()
    //by using this ,input statement decrease then the hence we can give with only single statement
    static int sum2(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int sum1(){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static void sum(){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println(sum);
    }
}
