package Arrays;

import java.util.Scanner;

public class shah1 {
    public static void main(String[] args) {
        int a;
        int a1;
        int b;
        int b1;
        char ch;
        char ch1;
        Scanner input = new Scanner(System.in);
        System.out.println("Zadai pozicii na purvoto pole: ");
        a = input.nextInt();
        a1 = input.nextInt();
        System.out.println("Zadai pozicii na vtoroto pole: ");
        b = input.nextInt();
        b1 = input.nextInt();
        if (a % 2 == 0) {
            if (a1 % 2 == 0) {
                ch = 'b';
            } else {
                ch = 'w';
            }
        } else {
            if (a1 % 2 == 0) {
                ch = 'w';
            } else {
                ch = 'b';
            }
        }
        if (b % 2 == 0) {
            if (b1 % 2 == 0) {
                ch1 = 'b';
            } else {
                ch1 = 'w';
            }
            }else{
                if (b1 % 2 == 0) {
                    ch1 = 'w';
                } else {
                    ch1 = 'b';
                }
            }
        if (ch == ch1) {
            System.out.println("Poletata sa ednakvi!");
        } else {
            System.out.println("Poletata sa razlichni!");
        }
    }
  }

