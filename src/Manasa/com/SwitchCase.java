package Manasa.com;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
        switch(fruit){
//            case "mango":
//                System.out.println("mango is summer seasonal fruit ");
//              break;
//            case "guava":
//                System.out.println("guava is my favourite fruit ");
//                break;
//            case "watermelon":
//                System.out.println("watermelon consist of many seeds ");
//                break;
//            case "grapes":
//                System.out.println("i hate grapes ");
//                break;
//            default:
//                System.out.println("please enter the valid fruit name ");
            case "mango"-> System.out.println("mango is summer seasonal fruit ");
            case "guava"->System.out.println("guava is my favourite fruit ");
            case "watermelon"->System.out.println("watermelon consist of many seeds ");
            case "grapes"->System.out.println("i hate grapes ");
            default->System.out.println("please enter the valid fruit name ");

        }
    }
}
