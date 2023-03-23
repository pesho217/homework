package Loops;
import java.util.Scanner;
public class ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = input.nextInt();
        int a1 = a;
        do{
            a = a*(a1-1);
            a1 = a1 - 1;
        }while(a1-1 > 1);
        System.out.println(a);
    }
}
