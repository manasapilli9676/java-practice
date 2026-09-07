import java.util.Scanner;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        if(x<=y&&x<=z){
            System.out.println("smallest number is :"+x);
        }else if(y<=z&&y<=x){
            System.out.println("smallest number is:"+y);
        }else{
            System.out.println("smallest number is:"+z);
        }
    }
}
