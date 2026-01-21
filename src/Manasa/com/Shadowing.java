package Manasa.com;

public class Shadowing  {
   static int x=34;//
    public static void main(String[] args) {
        System.out.println(x);//x=34
       // int x=224;//see here we can declare  x another time
        int x;
       // System.out.println(x);//here we get an error because in a scope when the scope is initialized then only we can use
        x=224;
        System.out.println(x);//x=224
        some();
    }
    static void some(){
        System.out.println(x);

    }
}
