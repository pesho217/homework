package Loops;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int sum = 0;
        for(int i = 0; i <= number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}