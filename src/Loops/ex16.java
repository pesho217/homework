package Loops;
import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        if(b > a) {
            for (int i = b; i >= a; i--) {
                if (i % 50 == 0) {
                    System.out.println(i);
                }
            }
        }else{
            for (int i = a; i >= b; i--) {
                if (i % 50 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
