import java.util.Scanner;
public class LargestOfFour {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        int a=input.nextInt();
        if(x>=y&&x>=z&&x>=a){
            System.out.println("greatest:"+x);
        }else if(y>=x&&y>=z&&y>=a){
            System.out.println("greatest :"+y);
        }else if(z>=x&&z>=y&&z>=a){
            System.out.println("greatest:"+z);
        }else{
            System.out.println("greatest:"+a);
        }
    }
}
