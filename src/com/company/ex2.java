package com.company;
import java.util.Scanner;
//Въведете 2 различни цели числа от конзолата. Запишете тяхната сума,
//разлика, произведение, остатък от деление и целочислено деление в
//отделни променливи и разпечатайте тези резултати в конзолата.
//Опитайте същото с числа с плаваща запетая.
public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int diff = Math.abs(a - b);
        int multi = a * b;
        int dev = a % b;
        int dev1 = a / b;
        System.out.println("The difference between a and b: " + diff);
        System.out.println("The multiplication between a and b: " + multi);
        System.out.println("The devision between a and b: " + dev1);
        System.out.println("The devision between a and b: " + dev);
    }
}
