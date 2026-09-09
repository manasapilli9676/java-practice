import java.util.Scanner;
public class DoWhilemenu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice;
        do{
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Add Student");
                    break;
                case 2:
                    System.out.println("View Students");
                    break;
                case 3:
                    System.out.println("Search Student");
                    break;
                case 4:
                    System.out.println("Delete Student");
                    break;
                case 5:
                    System.out.println(" Exit");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(choice!=5);
    }
}
