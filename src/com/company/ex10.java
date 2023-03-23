package com.company;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the litres capacity of the tank: ");
        int tank = input.nextInt();
        int tank1 = tank;
        int counter = 0;
        while(tank1 > 5){
            tank1 = tank1 - 5;
            counter++;
        }
        System.out.println(counter + " mal 2 litres " + counter + " mal 3 litres " + 1 + " mal " + tank1 + " litres");
    }
}
