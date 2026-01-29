package Manasa.com;

public class Array {
    public static void main(String[] args) {
        int a=20;
        String name="manasa";
        //syntax
        //datatype[] variable_name=new datatype[size];
        //store 5 rollno;
//        int[] roll=new int[5];
//        //or directly
//        int[] rollno={4,5,5,6,7};
        int[] rol;//declaration of array ros is getting defined  here int he satck
        //compile time
        rol=new int[5];
        // initialization :actually here object is being created in the heep
        //run time at the run  time memory is allocated so it is called as dynamic memory allocation
         //heep memory store in the  values
        //stack memory stores the  data types
        //array objects are in heap
        // objects are not continuous
         //index
        // new is a key word to create an object
        System.out.println(rol[2]);
        String[] arr=new String[4];
        System.out.println(arr[2]);
//here if we not assaign any thing then it is null ex:int[] arr; it is null
        //if int[] arr=new int[4];
        //it cant be null
        //null can be for non primitive type ex strings
    }
}
