package Arrays;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        int[] array1 = new int[size];
        for(int i = 0; i < size; i++){
            if(i == 0 || i == size - 1){
                array1[i] = array[i];
            }else{
                array1[i] = array[i-1] + array[i + 1];
            }
        }
        for(int i = 0; i < size; i++){
            if(i < size - 1) {
                System.out.print(array1[i] + ",");
            }else{
                System.out.print(array1[i]);
            }
        }
    }
}
