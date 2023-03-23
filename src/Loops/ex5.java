package Loops;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int a1 = a;
        int b1 = b;

        if(a > b){
            while(a != (b1 - 1)){
                System.out.println(b1);
                b1 = b1 + 1;
            }
          }else{
            while(b != (a1 - 1)){
                System.out.println(a1);
                a1 = a1 + 1;
            }
        }
    }
}
