package com.company;
import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int celsius = input.nextInt();
        if(celsius < -20){
            System.out.println("very cold");
        }else if(celsius > -20 && celsius < 0){
            System.out.println("cold");
        }else if(celsius > 0 && celsius < 15){
            System.out.println("a little cold");
        }else if(celsius > 15 && celsius < 25){
            System.out.println("warm");
        }else if(celsius > 25){
            System.out.println("hot");
        }
    }
}
