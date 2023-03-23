package com.company;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a1" );
        int a1 = input.nextInt();
        System.out.println("Enter a2: ");
        int a2 = input.nextInt();
        System.out.println("Enter a3: ");
        int a3 = input.nextInt();
        int swap = a1;
        a1 = a2;
        a2 = a3;
        a3 = swap;
        System.out.println(a1 +  " " +  a2 +  " " + a3);
    }
}
