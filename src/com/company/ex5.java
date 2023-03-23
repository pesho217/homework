package com.company;
import java.util.Scanner;
//Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
//ред.
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 1;
        int second = 1;
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        System.out.println("Enter c: ");
        int c = input.nextInt();
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
            first = 2;
        }else if(c > a && c > b){
            System.out.println(c);
            first = 3;
        }
        if(first == 1){
            if(b > c){
                System.out.println(b);
                second = 2;
            }else{
                System.out.println(c);
                second = 3;
            }
        }else if(first == 2){
            if(a > c){
                System.out.println(a);
            }else{
                System.out.println(c);
                second = 3;
            }
        }else if(first == 3){
            if(a > b){
                System.out.println(a);
            }else{
                System.out.println(b);
                second = 2;
            }
        }
        if((second == 1 && first == 2) || (first == 1 && second == 2)){
            System.out.println(c);
        }else if((first == 2 && second == 3) || (first == 3 && second == 2)){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}
