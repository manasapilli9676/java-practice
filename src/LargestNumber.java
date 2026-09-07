import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        if(x>=y&&x>=z){
            System.out.println("greater number is :"+x);
        }else if(y>=z&&y>=x){
            System.out.println("greater number is:"+y);
        }else{
            System.out.println("greater number is:"+z);
        }
    }
}
