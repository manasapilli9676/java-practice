package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class Maxvalue {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[][] accounts={{7,6,5},
                {5,7,5},
                {6,8,5}};
       int ans= maxvalueee(accounts);
        System.out.println(ans);
    }
    static int maxvalueee(int[][] accounts){
        //person=row
        //account=col
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            //when i start a new col take a new sum for that row
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum=sum+accounts[person][account];
            }
            //now we havre some of accounts of the persons
            //
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
    }
}
