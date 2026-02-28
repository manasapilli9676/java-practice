package Manasa.com;
import java.util.Scanner;
public class SearchinStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name="ram";
        char element = 'm';
        boolean ans =search(name,element);
    }
    static boolean search(String name,char element){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(element==name.charAt(i)){
                return true;
            }

        }
        return false;
    }

}
