import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value;
        do{
            value=input.nextInt();
            switch(value){
                case 1:
                    System.out.println("Add student");
                    break;
                case 2:
                    System.out.println("View student");
                    break;
                case 3:
                    System.out.println("exit");
                    break;
                 default:
                     System.out.println("invalid");
            }

        }while(value!=0);
    }
}
