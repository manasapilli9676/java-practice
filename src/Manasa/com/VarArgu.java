package Manasa.com;
import java.util.Arrays;
public class VarArgu {
    public static void main(String[] args) {
        fun(1,3,4,3,54,6,4,5,6,7,3);
        multi(1,2,"manasa",3,4,5,5,5,6,6);

    }//sequence should folllow  first there ae only two integers  later it has strings
    static void multi(int a,int b,String name,int ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(name);
    }

        static void fun(int ...v){//only three dots
        // here variable can be declared in any data type like char string
            System.out.println(Arrays.toString(v));

    }
}
