package com.company;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int multi = a * b;
        int last = multi % 10;
        if((last % 2) == 0 ){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
