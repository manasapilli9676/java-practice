package Manasa.com;
import java.util.Scanner;
import java.util.ArrayList;
public class ArraylistExmpl {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);

//        list.add(67);
//
//        list.add(673);
//        list.add(6237);
//        list.add(373);
//        list.add(6723);
//        list.add(654);
//        list.contains(654);
//        System.out.println( list.contains(654));
//        System.out.println(list.remove(1));
//        System.out.println(list);
//        list.set(0,32);
//        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here,list[index] syntax will not work hwre
        }
//        System.out.println(list);

    }


}
