package Arrays;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++){
            if(array[i] == array[i+1]){

            }
        }
    }
}

