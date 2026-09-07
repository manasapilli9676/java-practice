import java.util.Scanner;
public class WhileLOopPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==0) {
//                System.out.println("i is even :"+i);
            }else{
                System.out.println("i is odd:"+i);
            }
            i++;
        }
    }
}
