package com.company;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = input.nextInt();
        while(a < 1000){
            System.out.println("Enter number: ");
            a = input.nextInt();
        }
        int first = a / 1000;
        int second = (a / 100) % 10;
        int third = (a / 10) % 10;
        int fourth = a % 10;
        int new1 = first * 10 + fourth;
        int new2 = second * 10 + third;
        if(new1 > new2 ){
            System.out.println("Number 1 is greater than number 2! ");
        }
        if(new1 == new2){
            System.out.println("Number 1 and 2 are equal! ");
        }
        if(new1 < new2){
            System.out.println("Number 2 is greater than number 1! ");
        }
    }
}
