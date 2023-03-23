package com.company;
import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = input.nextInt();
        System.out.println("Enter month: ");
        int month = input.nextInt();
        System.out.println("Enter year: ");
        int year = input.nextInt();
        int year1 = 0;
        int month1 = 0;
        if(year%4 == 0){
            year1 = 1;
        }
        if(year > 99) {
            if(year%100 == 0) {
                year1 = 0;
                if (year % 400 == 0) {
                    year1 = 1;
                }
            }
        }
        if(month < 8 && month%2 == 0){
            month1 = 30;
            if(month == 2){
                if(year1 == 1){
                    month1 = 29;
                }else{
                    month1 = 28;
                }
            }
        }else if(month < 8 && month % 2 != 0){
            month1 = 31;
        }else if(month % 2 == 0){
            month1 = 31;
        }else {
            month1 = 30;
        }
        while(day > month1 || day < 1){

            System.out.println("Enter a valid day of the month!");
            System.out.println("Enter day: ");
            day = input.nextInt();
            System.out.println("Enter month: ");
            month = input.nextInt();
            System.out.println("Enter year: ");
            year = input.nextInt();
        }
        while(month < 1 || month > 12){
            System.out.println("Enter a valid month!");
            System.out.println("Enter day: ");
            day = input.nextInt();
            System.out.println("Enter month: ");
            month = input.nextInt();
            System.out.println("Enter year: ");
            year = input.nextInt();
        }
        while(year < 1){
            System.out.println("Enter a valid year!");
            System.out.println("Enter day: ");
            day = input.nextInt();
            System.out.println("Enter month: ");
            month = input.nextInt();
            System.out.println("Enter year: ");
            year = input.nextInt();
        }
        if(day == month1){
            if(month == 12){
                System.out.println("1.01." + (year + 1));
            }else {
                System.out.println("1." + (month + 1) + "." + year);
            }
        }else{
            System.out.println(day + 1 + "." + month + "." + year);
        }
    }

}
