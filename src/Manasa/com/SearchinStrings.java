package Manasa.com;
import java.util.Scanner;
public class SearchinStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name="manasa";
        char element = 'n';
        boolean ans =search(name,element);
        System.out.println(ans);
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
