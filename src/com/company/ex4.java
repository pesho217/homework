package com.company;
import java.util.Scanner;
//Въведете 2 различни числа от конзолата и ги разпечатайте в
//нарастващ ред.
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        if(a > b ){
            System.out.println(b);
            System.out.println(a);
        }else{
            System.out.println(a);
            System.out.println(b);
        }
    }
}
