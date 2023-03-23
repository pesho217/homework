package com.company;

import java.util.Scanner;

//Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//клавиатурата A и B (може да са с плаваща запетая – double).
//После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//Да се изведе подходящо съобщение за това дали C е между A и B.
public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter A");
        double A = input.nextDouble();
        System.out.println("Enter B");
        double B = input.nextDouble();
        System.out.println("Enter C");
        double C = input.nextDouble();
        if(C>A && C<B){
        System.out.println("C is between A and B ");
        }else{
        System.out.println("C isn't between A and B");
     }
    }
}
