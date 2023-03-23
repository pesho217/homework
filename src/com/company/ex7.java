package com.company;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = input.nextInt();
        System.out.println("Enter money: ");
        float money = input.nextFloat();
        System.out.println("Enter healthy condition: ");
        boolean health = input.nextBoolean();
        if(health == false){
            System.out.println(" I wont get out!");
        }
        if(money > 0){
            System.out.println("I will buy medicaments!");
        }
        if(money == 0){
            System.out.println("I will stay at home and drink tea!");
        }
        if(health == true){
            System.out.println("I will go to the cinema with friends!");
        }
        if(money < 10){
            System.out.println("I will go to the cafe");
        }


    }
}
