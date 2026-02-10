package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int customer=input.nextInt();
        int seller=input.nextInt();
        int[][] sale=new int[customer][seller];
        for(int i=0;i<customer;i++){
            for(int j=0;j<seller;j++){
                sale[i][j]=input.nextInt();

            }
        }
        int maxwealth=0;
        for(int i=0;i<customer;i++){
            int sum=0;
            for(int j=0;j<seller;j++){
                sum=sum+sale[i][j];

            }
            if(sum>m)
        }
    }
}
