package Manasa.com;

public class FunctionOverloading {
    public static void main(String[] args) {
        num1("manasa");
        num1(4);
        int sum=num1(2,4);

    }
    static int num1(int a,int b){
        int sum1=a+b;
        return sum1;
    }
    static void num1(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void num1(String name){
        System.out.println("second one");
        System.out.println(name);

    }
}
