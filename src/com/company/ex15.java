package com.company;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int a = input.nextInt();
        if(a>=4 && a<=9){
            System.out.println("Good morning!");
        }else if(a>9 && a<=18){
            System.out.println("Good day!");
        }else if((a>18 && a<=24) || (a>0 && a<4)){
            System.out.println("Good evening!");
        }
    }
}
