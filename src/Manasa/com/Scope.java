package Manasa.com;

public class Scope {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println(a);
        random(2);

        {
            //block scope
            //in this block scope if we declare hte variables number of times it show the error
             // we can change the value but we cannot declare
            // int a=23;we cannot declare like this
            //
             a=54;
             int c=99;
            System.out.println(a);

        }
        System.out.println(a);
        //System.out.println(c);we cant print c out side the block

    }
    //it is the function scope
    //it does allow any other variables to access in it if
    //if we use it it may show error
    // here we can declare number of times see with in a same program i hava initialized a and b two times ther is no change
    static void random(int marks){
        int a=2;
        int b=3;
       int num=a+b;
        System.out.println(num);
        System.out.println(a);
    }
}
