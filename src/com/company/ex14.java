package com.company;
import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int colour = 0;
        int colour1 = 0;
        System.out.println("Enter numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter numbers: ");
        int c = input.nextInt();
        int d = input.nextInt();
        if(a%2 == 0){
            if(b%2 == 0){
                colour = 1;
            }else{
                colour = 2;
            }

        }else {
            if(b%2 == 0){
                colour = 2;
            }else{
                colour = 1;
            }
        }
        if(c%2 == 0){
            if(d%2 == 0){
                colour1 = 1;
            }else{
                colour1 = 2;
            }

        }else {
            if(d%2 == 0){
                colour1 = 2;
            }else{
                colour1 = 1;
            }
        }
        System.out.println(colour);
        // 1 is black
        // 2 is white

        System.out.println(colour1);
        if(colour == colour1){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

    }
}
