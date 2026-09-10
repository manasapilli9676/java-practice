import java.util.Scanner;
public class ForLoopMultiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
//        for(int i=1;i<n;i++){
            for(int j=1;j<=10;j++){
                int value=i*j;
                System.out.println(i+"*"+j+"="+value);
            }
//        }
    }
}
