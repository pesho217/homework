package String;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 words: ");
        String word = input.next();
        String word2 = input.next();
        System.out.print(word.toUpperCase());
        System.out.print(" " + word);
        System.out.print(" " + word2.toUpperCase());
        System.out.println(" " + word2);


    }
}
