package com.company;
import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = input.nextInt();
        int count = a;
        int counter = 0;
        while(count != 0){
            count = count/10;
            counter++;
        }

        while(counter != 3){
            a = input.nextInt();
        }
        int first = a/100;
        int second = (a/10)%10;
        int last = a%10;

        if(first == second && second == last){
            System.out.println("Numbers are equal!");
        }else if(first < second && second < last){
            System.out.println("Numbers are arranged in ascending order!");
        }else if(first > second && second > last){
            System.out.println("Numbers are arranged in descending order!");
        }else{
            System.out.println("Numbers are not ordered!");
        }

    }
}
