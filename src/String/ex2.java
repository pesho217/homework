package String;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String word2 = input.next();
        if(word.length() > word2.length()){
            System.out.println(word.length());
        }else{
            System.out.println(word2.length());
        }

    }
}
