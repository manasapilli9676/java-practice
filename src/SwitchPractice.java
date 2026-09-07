import java.util.Scanner;
public class SwitchPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
          switch(choice){
              case 1:
                  System.out.println("add students");
                  break;
              case 2:
                  System.out.println("view students");
                  break;
              case 3:
                  System.out.println("search students");
                  break;
              case 4:
                  System.out.println("delete student");
                  break;
              case 5:
                  System.out.println("exit");
                  break;
              default:
                  System.out.println("invalid student");


          }

    }
}
