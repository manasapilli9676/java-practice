package Manasa.com;

public class Swap {
    public static void main(String[] args) {
        int a=23;
        int b=43;
        swap(a,b);
//        int temp=a;
//        a=b;
//        b=temp;
        //by using the functions
        System.out.println(a +" "+b);

    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
