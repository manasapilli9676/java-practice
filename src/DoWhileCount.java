import java.util.Scanner;
public class DoWhileCount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        int countpos=0;
        int countneg=0;
        do{
            num=input.nextInt();
            if(num>0){
                countpos++;
            }else if(num<0){
                countneg++;
            }
        }while(num!=0);
        System.out.println(countpos);
        System.out.println(countneg);
    }
}
