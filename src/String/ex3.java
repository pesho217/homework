package String;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        String word2 = input.next();
        int length;

        if(word.length() > word2.length()){
            length = word2.length();
        }else{
            length = word.length();
        }

        if(word.length() == word2.length()){
            System.out.println("The words are with the same length!");
        }else{
            System.out.println("The words are not with the same length!");
        }
        for(int i = 0; i < length; i++){
            if(word.charAt(i) != word2.charAt(i)){
                System.out.println(i + " " + word.charAt(i) + "->" + word2.charAt(i) );

            }
        }

    }
}
