package Arrays;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int size = input.nextInt();
        boolean equal = false;
        int counter = 0;
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int size1 = input.nextInt();
        int [] array1 = new int[size1];
        for(int i = 0; i < size1; i++){
            System.out.println("Enter element " + (i + 1));
            array1[i] = input.nextInt();
        }
        if(size == size1){
            int i = 0;
            while(i < size){
                if(array[i] != array1[i]){
                    counter++;
                }
                i++;
            }
            if(counter == 0){
                equal = true;
            }

        }

        System.out.println(equal);

    }

}
