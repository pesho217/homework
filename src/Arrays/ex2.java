package Arrays;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = input.nextInt();
            int [] array = new int[size];
            for(int i = 0; i < size; i++){
                System.out.println("Enter Element " + (i + 1));
                array[i] = input.nextInt();
            }
            int [] array1 = new int[size];
            for(int i = 0; i < size/2; i++){
                array1[i] = array[i];
            }
            if(size%2 == 0) {
                for (int i = 0; i < size / 2; i++) {
                    array1[size / 2 + i] = array[(size - 1) - i];
                }
            }else{
                for (int i = 0; i < size / 2 + 1; i++) {
                    array1[size / 2 + i] = array[(size - 1) - i];
                }
            }
            for(int i = 0; i < size; i++){
                System.out.print(array1[i] + " " );
            }

    }
}
