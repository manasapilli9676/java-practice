package Manasa.com;

public class IfStatement {

    public static void main(String[] args) {


    /*
    syntax for the if statement
    if(boolean expression T or F)
    {
    //body
    }
    else{
    //do this
    }
    */
        int salery = 90000;
        if (salery > 100000) {
            salery = salery + 5000;
          //  System.out.println(salery);

        } else {
            salery = salery + 2500;
           // System.out.println(salery);
        }
        System.out.println(salery);
    }
}