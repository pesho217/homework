package Arrays;
//tazi e bugqsana;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        boolean mirror = false;
        int counter = 0;
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the " + (i + 1) + " element of the array: ");
            array[i] = input.nextInt();
        }
            int i;
            int j;
            do {
                i = 0;
                j = size - 1;
                if (array[i] != array[j]) {
                    counter++;
                }
                i++;
                j--;

            } while (i < size/2);
            if(counter == 0) {
                mirror = true;
            }

                System.out.println("Mirror array: " + mirror);

    }
}
