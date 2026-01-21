package Manasa.com;

public class FunctionOverloading {
    public static void main(String[] args) {
        num1("manasa");
        num1(4);

    }
    static void num1(int a){
        System.out.println(a);
    }
    static void num1(String name){
        System.out.println(name);

    }
}
