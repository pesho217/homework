package Arrays;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            if(i == 0 || i == 1){
                array[i] = a;
            }else{
                array[i] = array[(i - 2)] + array[i - 1];
            }
        }
        for(int i = 0; i < 10; i++){
            if(i < 9) {
                System.out.print(array[i] + ",");
            }else{
                System.out.print(array[i]);
            }
        }


    }
}