import java.util.Scanner;
public class DoWhileLargest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        //int gv=0;
        int gv=Integer.MIN_VALUE;
        do{
            num=input.nextInt();
            if(num!=0&&num>gv){
                gv=num;
            }
        }while(num!=0);
        System.out.println(gv);
    }
}
