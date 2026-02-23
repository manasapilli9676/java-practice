package Manasa.com;
import java.util.Scanner;
import java.util.Arrays;
public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        boolean[] alphabet = new boolean[26];
        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;

            }
        }
        boolean ispangram = true;
        for (int i = 0; i < 26; i++) {
            if(!alphabet[i]){
            ispangram = false;
            break;
        }
    }
    if(ispangram)

    {
        System.out.println("The sentence is a Pangram.");
    } else

    {
        System.out.println("The sentence is NOT a Pangram.");
    }

        input.close();
}
}
