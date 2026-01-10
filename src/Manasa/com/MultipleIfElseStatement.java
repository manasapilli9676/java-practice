package Manasa.com;

public class MultipleIfElseStatement {
    public static void main(String[] args) {
      int salery=8000;
      if(salery>10000){
          salery+=1000;
      }
      else if(salery>20000){
          salery+=2000;
        }
      else if(salery>30000){
          salery+=3000;
      }
      else{
          salery+=9000;
      }
        System.out.println(salery);
    }
}
