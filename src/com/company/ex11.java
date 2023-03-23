package com.company;
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int counter = 0;
        int a = input.nextInt();
        int a1 = a;
        boolean mac = false;
        while(a1 != 0){
            a1 = a1/10;
            counter++;
        }
        while(counter != 3){
            a = input.nextInt();
        }
        int first = a/100;
        int third = a%10;
        int second = (a/10)%10;
        while(first == 0 || second == 0 || third == 0){
            a = input.nextInt();
            first = a/100;
            third = a%10;
            second = (a/10)%10;
        }
        if(a%first == 0 && a%second == 0 && a%third == 0){
            mac = true;
        }
        System.out.println(mac);
    }
}


