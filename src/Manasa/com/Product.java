package Manasa.com;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int result=pro(num1,num2);
        System.out.println("product of two num "+result);
    }
    static int pro(int num1,int num2){
        int product=num1*num2;
        return product;
    }
}
