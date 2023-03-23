package com.company;
import java.util.Scanner;
//Въведете 2 различни числа от конзолата и разменете стойността им.
//Разпечатайте новите стойности
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int swap;
        swap = a;
        a = b;
        b = swap;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
