package Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int min = 99999;
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the " + (i + 1) + " element of the array: ");
            array[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
            if(array[i]%3 == 0 && array[i] < min){
                min = array[i];
            }

        }
        System.out.println("The min element divorsed by 3 is: " + min);
    }
}
