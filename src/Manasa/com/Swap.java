package Manasa.com;
// here we required answers are not getting
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
        String name="manasa";
        changeName(name);
        System.out.println(name);


    }
    static void changeName(String naae){
        naae="pilli";
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;

    }
}
//creating the new objest it doesnt change but if we modify it it definitely changes